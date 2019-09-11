package pokerhand;

import card.Card;
import enums.CardValues;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CalculateHandUtils {

    public static boolean isStraight(List<Card> hand) {
        List<Integer> sortedValues =  hand.stream().map(v -> v.getValue().equals(CardValues.ACE) ? 0 : v.getValue().ordinal())
                .sorted().collect(Collectors.toList());

        int firstValue = sortedValues.get(0);
        List<Integer> straight = IntStream.range(firstValue, firstValue + 5).boxed().collect(Collectors.toList());

        return straight.equals(sortedValues);
    }

    public static boolean isHighestStraight(List<Card> hand) {
        List<Integer> sortedValues =  hand.stream().map(v -> v.getValue().ordinal()).sorted().collect(Collectors.toList());
        int firstValue = CardValues.TEN.ordinal();

        List<Integer> straight = IntStream.range(firstValue, firstValue + 5).boxed().collect(Collectors.toList());

        return straight.equals(sortedValues);
    }

    public static boolean isFlush(List<Card> cards) {
        return cards.stream().map(Card::getSymbol).distinct().count() == 1;
    }

    public static Map<CardValues, Long> getValueCountMap(List<Card> hand) {
        return hand.stream().map(Card::getValue).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static long getCardValueCount(List<Card> hand, int count) {
        Map<CardValues, Long> handValueCountMap = CalculateHandUtils.getValueCountMap(hand);
        Stream stream = handValueCountMap.values().stream().filter(value -> value == count);
        return stream.count();
    }
        }
