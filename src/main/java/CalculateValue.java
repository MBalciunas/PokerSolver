import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CalculateValue {

    public static boolean isRoyalFlush(List<Card> cards) {
        boolean isOneColor = isOneColor(cards);
        boolean isHighestStraight = isHighestStraight(cards);

        return isOneColor && isHighestStraight;
    }

    public static boolean isStraightFlush(List<Card> hand) {
        boolean isOneColor = isOneColor(hand);
        boolean isStraight =  isStraight(hand);

        return isStraight && isOneColor && !isHighestStraight(hand);
    }

    private static boolean isStraight(List<Card> hand) {
        List<Integer> sortedValues =  hand.stream().map(v -> v.getValues().equals(Values.ACE) ? 0 : v.getValues().ordinal())
                .sorted().collect(Collectors.toList());

        int firstValue = sortedValues.get(0);
        List<Integer> straight = IntStream.range(firstValue, firstValue + 5).boxed().collect(Collectors.toList());

        return straight.equals(sortedValues);
    }

    private static boolean isHighestStraight(List<Card> hand) {
        List<Integer> sortedValues =  hand.stream().map(v -> v.getValues().ordinal()).sorted().collect(Collectors.toList());
        int firstValue = Values.TEN.ordinal();

        List<Integer> straight = IntStream.range(firstValue, firstValue + 5).boxed().collect(Collectors.toList());

        return straight.equals(sortedValues);
    }

    private static boolean isOneColor(List<Card> cards) {
        return cards.stream().map(Card::getSymbols).distinct().count() == 1;
    }
}
