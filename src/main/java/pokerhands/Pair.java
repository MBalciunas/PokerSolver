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
    public int compare(List<Card> firstHand, List<Card> secondHand) {
        return 0;
    }
}
