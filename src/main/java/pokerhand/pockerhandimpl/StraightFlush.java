package pokerhand.pockerhandimpl;

import card.Card;
import pokerhand.CalculateHandUtils;
import pokerhand.PokerHand;
import enums.PokerHands;

import java.util.List;
import java.util.stream.Collectors;

public class StraightFlush implements PokerHand {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        boolean isOneColor = CalculateHandUtils.isFlush(hand);
        boolean isStraight =  CalculateHandUtils.isStraight(hand);

        return isStraight && isOneColor && !CalculateHandUtils.isHighestStraight(hand);
    }

    @Override
    public PokerHands getPokerHand() {
        return PokerHands.STRAIGHT_FLUSH;
    }

    @Override
    public int compare(List<Card> firstHand, List<Card> secondHand) {
        List<Integer> firstHandValues = CalculateHandUtils.getDescendingSortedValues(firstHand);
        List<Integer> secondHandValues = CalculateHandUtils.getDescendingSortedValues(secondHand);
        return Integer.compare(firstHandValues.get(0), secondHandValues.get(0));
    }
}
