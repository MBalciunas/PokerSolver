package pokerhands;

import models.Card;

import java.util.List;

public class Straight implements PokerHand {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        return CalculateHandUtils.isStraight(hand);
    }

    @Override
    public PokerHands getPokerHand() {
        return PokerHands.STRAIGHT;
    }

    @Override
    public int compare(List<Card> firstHand, List<Card> secondHand) {
        return 0;
    }
}
