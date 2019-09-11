package pokerhands;

import models.Card;

import java.util.List;

public class HighCard implements PokerHand {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        return true;
    }

    @Override
    public PokerHands getPokerHand() {
        return PokerHands.HIGH_CARD;
    }

    @Override
    public int compare(List<Card> firstHand, List<Card> secondHand) {
        return 0;
    }
}
