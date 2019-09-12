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
        List<Integer> firstHandValues = CalculateHandUtils.getDescendingSortedValues(firstHand);
        List<Integer> secondHandValues =  CalculateHandUtils.getDescendingSortedValues(secondHand);
        modifyListForPairValue(firstHand, firstHandValues);
        modifyListForPairValue(secondHand, secondHandValues);
        return CalculateHandUtils.compareCardValues(firstHandValues, secondHandValues);
    }

    private void modifyListForPairValue(List<Card> hand, List<Integer> handValues) {
        modifyListForValueCount(hand, handValues, 2);
        modifyListForValueCount(hand, handValues, 3);
    }

    private void modifyListForValueCount(List<Card> hand, List<Integer> handValues, int i) {
        int threePairValue = CalculateHandUtils.getCardValues(hand, i).get(0);
        handValues.remove(Integer.valueOf(threePairValue));
        handValues.add(0, threePairValue);
    }
}
