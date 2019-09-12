package pokerhand.pockerhandimpl;

import card.Card;
import enums.CardSymbols;
import enums.CardValues;
import pokerhand.CalculateHandUtils;
import pokerhand.PokerHand;
import enums.PokerHands;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pair implements PokerHand {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        return CalculateHandUtils.getCardValueCount(hand, 2) == 1;
    }

    @Override
    public PokerHands getPokerHand() {
        return PokerHands.PAIR;
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
        int pairValue = CalculateHandUtils.getCardValues(hand, 2).get(0);
        handValues.remove(Integer.valueOf(pairValue));
        handValues.add(0, pairValue);
    }
}
