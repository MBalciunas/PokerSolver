import models.Card;
import org.junit.Test;
import pokerhands.PokerHandFactory;
import pokerhands.PokerHands;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class IntegrationTest {

    @Test
    public void testIsRoyalFlush() {
        List<Card> hand = TestUtils.getRoyalFlushHand();

        assertEquals(PokerHands.ROYAL_FLUSH,PokerHandFactory.getPokerHand(hand).getPokerHand());
    }

    @Test
    public void testIsStraightFlush() {
        List<Card> hand = TestUtils.getStraightFlushHand();

        assertEquals(PokerHands.STRAIGHT_FLUSH,PokerHandFactory.getPokerHand(hand).getPokerHand());
    }

    @Test
    public void testIsFourOfAKind() {
        List<Card> hand = TestUtils.getFourOfAKindHand();

        assertEquals(PokerHands.FOUR_OF_A_KIND,PokerHandFactory.getPokerHand(hand).getPokerHand());
    }

    @Test
    public void testIsFulHouse() {
        List<Card> hand = TestUtils.getFullHouseHand();

        assertEquals(PokerHands.FULL_HOUSE,PokerHandFactory.getPokerHand(hand).getPokerHand());
    }

    @Test
    public void testIsFlush() {
        List<Card> hand = TestUtils.getFlushHand();

        assertEquals(PokerHands.FLUSH,PokerHandFactory.getPokerHand(hand).getPokerHand());
    }

    @Test
    public void testIsStraight() {
        List<Card> hand = TestUtils.getStraightHand();

        assertEquals(PokerHands.STRAIGHT,PokerHandFactory.getPokerHand(hand).getPokerHand());
    }

    @Test
    public void testIsThreeOfAKind() {
        List<Card> hand = TestUtils.getThreeOfAKindHand();

        assertEquals(PokerHands.THREE_OF_A_KIND,PokerHandFactory.getPokerHand(hand).getPokerHand());
    }

    @Test
    public void testIsTwoPair() {
        List<Card> hand = TestUtils.getTwoPairHand();

        assertEquals(PokerHands.TWO_PAIR,PokerHandFactory.getPokerHand(hand).getPokerHand());
    }

    @Test
    public void testIsPair() {
        List<Card> hand = TestUtils.getPairHand();

        assertEquals(PokerHands.PAIR,PokerHandFactory.getPokerHand(hand).getPokerHand());
    }

    @Test
    public void testIsHighCard() {
        List<Card> hand = TestUtils.getHighCardHand();

        assertEquals(PokerHands.HIGH_CARD,PokerHandFactory.getPokerHand(hand).getPokerHand());
    }
}
