package pokerhands;

import models.Card;
import java.util.List;

public class TwoPair implements PokerHand  {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        return CalculateHandUtils.getPairCount(hand) == 2;
    }

    @Override
    public PokerHands getPokerHand() {
        return PokerHands.TWO_PAIR;
    }

    @Override
    public boolean isHigherThan(List hand) {
        return false;
    }
}
