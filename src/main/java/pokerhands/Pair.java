package pokerhands;

import models.Card;

import java.util.List;

public class Pair implements PokerHand {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        return CalculateHandUtils.getPairCount(hand) == 1;
    }

    @Override
    public PokerHands getPokerHand() {
        return PokerHands.PAIR;
    }

    @Override
    public boolean isHigherThan(List hand) {
        return false;
    }
}
