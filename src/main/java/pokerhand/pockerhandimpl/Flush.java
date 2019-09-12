package pokerhand.pockerhandimpl;

import card.Card;
import pokerhand.CalculateHandUtils;
import pokerhand.PokerHand;
import enums.PokerHands;

import java.util.List;
import java.util.stream.Collectors;

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
        List<Integer> firstHandValues = CalculateHandUtils.getDescendingSortedValues(firstHand);
        List<Integer> secondHandValues = CalculateHandUtils.getDescendingSortedValues(secondHand);
        return CalculateHandUtils.compareCardValues(firstHandValues, secondHandValues);
    }
}
