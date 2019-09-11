package pokerhands;

import models.Card;

import java.util.List;
import java.util.Map;

public class ThreeOfAKind implements PokerHand  {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        Map handValueCountMap = CalculateHandUtils.getValueCountMap(hand);
        return handValueCountMap.containsValue(3L);
    }

    @Override
    public PokerHands getPokerHand() {
        return PokerHands.THREE_OF_A_KIND;
    }

    @Override
    public int compare(List<Card> firstHand, List<Card> secondHand) {
        return 0;
    }
}
