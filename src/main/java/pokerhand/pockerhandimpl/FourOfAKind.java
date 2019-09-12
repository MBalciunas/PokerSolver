package pokerhand.pockerhandimpl;

import java.util.List;
import java.util.stream.Collectors;

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
        List<Integer> firstHandValues = CalculateHandUtils.getDescendingSortedValues(firstHand);
        List<Integer> secondHandValues =  CalculateHandUtils.getDescendingSortedValues(secondHand);
        modifyListForPairValue(firstHand, firstHandValues);
        modifyListForPairValue(secondHand, secondHandValues);
        return CalculateHandUtils.compareCardValues(firstHandValues, secondHandValues);
    }

    private void modifyListForPairValue(List<Card> hand, List<Integer> handValues) {
        int pairValue = CalculateHandUtils.getCardValues(hand, 4).get(0);
        handValues.remove(Integer.valueOf(pairValue));
        handValues.add(0, pairValue);
    }
}
