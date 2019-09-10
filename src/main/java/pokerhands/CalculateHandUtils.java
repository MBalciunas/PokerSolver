package pokerhands;

import models.Card;
import models.Values;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CalculateHandUtils {

    public static boolean isStraight(List<Card> hand) {
        List<Integer> sortedValues =  hand.stream().map(v -> v.getValues().equals(Values.ACE) ? 0 : v.getValues().ordinal())
                .sorted().collect(Collectors.toList());

        int firstValue = sortedValues.get(0);
        List<Integer> straight = IntStream.range(firstValue, firstValue + 5).boxed().collect(Collectors.toList());

        return straight.equals(sortedValues);
    }

    public static boolean isHighestStraight(List<Card> hand) {
        List<Integer> sortedValues =  hand.stream().map(v -> v.getValues().ordinal()).sorted().collect(Collectors.toList());
        int firstValue = Values.TEN.ordinal();

        List<Integer> straight = IntStream.range(firstValue, firstValue + 5).boxed().collect(Collectors.toList());

        return straight.equals(sortedValues);
    }

    public static boolean isFlush(List<Card> cards) {
        return cards.stream().map(Card::getSymbols).distinct().count() == 1;
    }

    public static Map<Values, Long> getValueCountMap(List<Card> hand) {
        return hand.stream().map(Card::getValues).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static long getPairCount(List<Card> hand) {
        Map<Values, Long> handValueCountMap = CalculateHandUtils.getValueCountMap(hand);
        Stream stream = handValueCountMap.values().stream().filter(value -> value == 2);
        return stream.count();
    }
}
