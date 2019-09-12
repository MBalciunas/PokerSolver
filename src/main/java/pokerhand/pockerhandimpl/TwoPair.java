package pokerhand.pockerhandimpl;

import card.Card;
import pokerhand.CalculateHandUtils;
import pokerhand.PokerHand;
import enums.PokerHands;

import java.util.List;

public class TwoPair implements PokerHand {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        return CalculateHandUtils.getCardValueCount(hand, 2) == 2;
    }

    @Override
    public PokerHands getPokerHand() {
        return PokerHands.TWO_PAIR;
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
        List<Integer> pairValue = CalculateHandUtils.getCardValues(hand, 2);
        if(pairValue.get(0) > pairValue.get(1)) {
            handValues.remove(Integer.valueOf(pairValue.get(1)));
            handValues.add(0, pairValue.get(1));
            handValues.remove(Integer.valueOf(pairValue.get(0)));
            handValues.add(0, pairValue.get(0));
        }
        else {
            handValues.remove(Integer.valueOf(pairValue.get(0)));
            handValues.add(0, pairValue.get(0));
            handValues.remove(Integer.valueOf(pairValue.get(1)));
            handValues.add(0, pairValue.get(1));
        }
    }
}
