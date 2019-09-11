package pokerhands;

import java.util.List;
import java.util.Map;
import models.Card;

public class FourOfAKind implements PokerHand {
    @Override
    public boolean isPokerHand(List<Card> hand) {
        Map handValueCountMap = CalculateHandUtils.getValueCountMap(hand);
        return handValueCountMap.containsValue(4L);
    }

    @Override
    public PokerHands getPokerHand() {
        return PokerHands.FOUR_OF_A_KIND;
    }

    @Override
    public int compare(List<Card> firstHand, List<Card> secondHand) {
        return 0;
    }
}
