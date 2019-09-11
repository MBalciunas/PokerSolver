package pokerhands;

import models.Card;

import java.util.List;

public interface PokerHand {

    public boolean isPokerHand(List<Card> hand);
    public PokerHands getPokerHand();
    public int compare(List<Card> firstHand, List<Card> secondHand);
}
