package pokerhands;

import models.Card;

import java.util.List;
import java.util.Map;

public class FullHouse implements PokerHand {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        Map handValueCountMap = CalculateHandUtils.getValueCountMap(hand);
        return handValueCountMap.containsValue(3L) && handValueCountMap.containsValue(2L);
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
