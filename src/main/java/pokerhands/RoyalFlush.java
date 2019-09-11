package pokerhands;

import models.Card;

import java.util.List;

public class RoyalFlush implements PokerHand {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        boolean isOneColor = CalculateHandUtils.isFlush(hand);
        boolean isHighestStraight = CalculateHandUtils.isHighestStraight(hand);

        return isOneColor && isHighestStraight;
    }

    @Override
    public PokerHands getPokerHand() {
        return PokerHands.ROYAL_FLUSH;
    }

    @Override
    public int compare(List<Card> firstHand, List<Card> secondHand) {
        return 0;
    }
}
