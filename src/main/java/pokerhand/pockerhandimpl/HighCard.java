package pokerhand.pockerhandimpl;

import card.Card;
import pokerhand.CalculateHandUtils;
import pokerhand.PokerHand;
import enums.PokerHands;

import java.util.List;
import java.util.stream.Collectors;

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
        List<Integer> firstHandValues = CalculateHandUtils.getDescendingSortedValues(firstHand);
        List<Integer> secondHandValues = CalculateHandUtils.getDescendingSortedValues(secondHand);
        return CalculateHandUtils.compareCardValues(firstHandValues, secondHandValues);
    }
}
