package pokerhand.pockerhandimpl;

import java.util.List;
import card.Card;
import pokerhand.CalculateHandUtils;
import pokerhand.PokerHand;
import enums.PokerHands;

public class FourOfAKind implements PokerHand {

    @Override
    public boolean isPokerHand(List<Card> hand) {
        return CalculateHandUtils.getCardValueCount(hand, 4) == 1;
    }

    @Override
    public PokerHands getPokerHand() {
        return PokerHands.FOUR_OF_A_KIND;
    }

    @Override
    public int compare(List<Card> firstHand, List<Card> secondHand) {
        return 0;
    }
}
