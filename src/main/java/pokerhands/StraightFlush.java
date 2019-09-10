package pokerhands;

import models.Card;

import java.util.List;

public class StraightFlush implements PokerHand  {
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
    public boolean isHigherThan(List hand) {
        return false;
    }
}
