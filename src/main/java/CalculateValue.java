import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CalculateValue {

    public static boolean isRoyalFlush(List<Card> cards) {
        boolean isOneColor = isFlush(cards);
        boolean isHighestStraight = isHighestStraight(cards);

        return isOneColor && isHighestStraight;
    }

    public static boolean isStraightFlush(List<Card> hand) {
        boolean isOneColor = isFlush(hand);
        boolean isStraight =  isStraight(hand);

        return isStraight && isOneColor && !isHighestStraight(hand);
    }

    public static boolean isFourOfAKind(List<Card> hand) {
        Map handValueCountMap = hand.stream().map(Card::getValues).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return handValueCountMap.containsValue(4L);
    }

    public static boolean isFullHouse(List<Card> hand ) {
        Map handValueCountMap = hand.stream().map(Card::getValues).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return handValueCountMap.containsValue(3L) && handValueCountMap.containsValue(2L);
    }

    public static boolean isStraight(List<Card> hand) {
        List<Integer> sortedValues =  hand.stream().map(v -> v.getValues().equals(Values.ACE) ? 0 : v.getValues().ordinal())
                .sorted().collect(Collectors.toList());

        int firstValue = sortedValues.get(0);
        List<Integer> straight = IntStream.range(firstValue, firstValue + 5).boxed().collect(Collectors.toList());

        return straight.equals(sortedValues);
    }

    public static boolean isThreeOfAKind(List<Card> hand) {
        Map handValueCountMap = hand.stream().map(Card::getValues).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return handValueCountMap.containsValue(3L);
    }

    private static boolean isHighestStraight(List<Card> hand) {
        List<Integer> sortedValues =  hand.stream().map(v -> v.getValues().ordinal()).sorted().collect(Collectors.toList());
        int firstValue = Values.TEN.ordinal();

        List<Integer> straight = IntStream.range(firstValue, firstValue + 5).boxed().collect(Collectors.toList());

        return straight.equals(sortedValues);
    }

    public static boolean isFlush(List<Card> cards) {
        return cards.stream().map(Card::getSymbols).distinct().count() == 1;
    }
}
