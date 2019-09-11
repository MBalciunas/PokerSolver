package pokerhand.pockerhandimpl;

import card.Card;
import pokerhand.CalculateHandUtils;
import pokerhand.PokerHand;
import enums.PokerHands;

import java.util.List;

public class FullHouse implements PokerHand {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        return CalculateHandUtils.getCardValueCount(hand, 3) == 1 &&
               CalculateHandUtils.getCardValueCount(hand, 2) == 1;
    }

    @Override
    public PokerHands getPokerHand() {
        return PokerHands.FULL_HOUSE;
    }

    @Override
    public int compare(List<Card> firstHand, List<Card> secondHand) {
        return 0;
    }
}
