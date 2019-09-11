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
    public int compare(List<Card> firstHand, List<Card> secondHand) {
        return 0;
    }
}
