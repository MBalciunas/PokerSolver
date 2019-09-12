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

    public static List<Integer> getDescendingSortedValues(List<Card> hand) {
        return hand.stream().map(v -> v.getValue().ordinal()).sorted((a, b) -> b - a).collect(Collectors.toList());
    }

    public static boolean isFlush(List<Card> cards) {
        return cards.stream().map(Card::getSymbol).distinct().count() == 1;
    }

    public static Map<CardValues, Long> getValueCountMap(List<Card> hand) {
        return hand.stream().map(Card::getValue).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static int getCardValueCount(List<Card> hand, int count) {
        return getCardValues(hand, count).size();
    }

    public static List<Integer> getCardValues(List<Card> hand, int count) {
        Map<CardValues, Long> handValueCountMap = CalculateHandUtils.getValueCountMap(hand);
        List values = handValueCountMap.values().stream().filter(value -> value == count).map(v -> v.intValue()).collect(Collectors.toList());
        return values;
    }


    public static int compareCardValues(List<Integer> firstHandValues, List<Integer> secondHandValues) {
        if(firstHandValues.size() == 1 && secondHandValues.size() == 1) {
            return Integer.compare(firstHandValues.get(0), secondHandValues.get(0));
        }
        if(firstHandValues.get(0) > secondHandValues.get(0)) {
            return 1;
        }
        if(firstHandValues.get(0) < secondHandValues.get(0)) {
            return -1;
        }
        firstHandValues.remove(0);
        secondHandValues.remove(0);
        return compareCardValues(firstHandValues, secondHandValues);
    }
}
