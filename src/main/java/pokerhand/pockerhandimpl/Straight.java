package pokerhand.pockerhandimpl;

import card.Card;
import pokerhand.CalculateHandUtils;
import pokerhand.PokerHand;
import enums.PokerHands;

import java.util.List;
import java.util.stream.Collectors;

public class Straight implements PokerHand {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        return CalculateHandUtils.isStraight(hand);
    }

    @Override
    public PokerHands getPokerHand() {
        return PokerHands.STRAIGHT;
    }

    @Override
    public int compare(List<Card> firstHand, List<Card> secondHand) {
        List<Integer> firstHandValues = CalculateHandUtils.getDescendingSortedValues(firstHand);
        List<Integer> secondHandValues = CalculateHandUtils.getDescendingSortedValues(secondHand);
        return Integer.compare(firstHandValues.get(0), secondHandValues.get(0));
    }
}
