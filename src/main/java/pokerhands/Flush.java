package pokerhands;

import models.Card;

import java.util.List;

public class Flush implements PokerHand {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        return CalculateHandUtils.isFlush(hand);
    }

    @Override
    public PokerHands getPokerHand() {
        return PokerHands.FLUSH;
    }

    @Override
    public int compare(List<Card> firstHand, List<Card> secondHand) {
        return 0;
    }
}
