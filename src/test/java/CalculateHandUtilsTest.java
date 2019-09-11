import models.Card;
import org.junit.Test;
import pokerhands.*;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class CalculateHandUtilsTest {

    @Test
    public void testCalculateRoyalFlush_True() {
        List<Card> hand = TestUtils.getRoyalFlushHand();

        assertTrue(new RoyalFlush().isPokerHand(hand));
    }


    @Test
    public void testCalculateRoyalFlush_False() {
        List<Card> hand = TestUtils.getHighCardHand();

        assertFalse(new RoyalFlush().isPokerHand(hand));
    }

    @Test
    public void testCalculateStraightFlush_True() {
        List<Card> hand = TestUtils.getStraightFlushHand();

        assertTrue(new StraightFlush().isPokerHand(hand));
    }


    @Test
    public void testCalculateStraightFlush_False() {
        List<Card> hand = TestUtils.getHighCardHand();

        assertFalse(new StraightFlush().isPokerHand(hand));
    }

    @Test
    public void testIsFourOfAKind_True() {
        List<Card> hand = TestUtils.getFourOfAKindHand();

        assertTrue(new FourOfAKind().isPokerHand(hand));
    }


    @Test
    public void testIsFourOfAKind_False() {
        List<Card> hand = TestUtils.getHighCardHand();

        assertFalse(new FourOfAKind().isPokerHand(hand));
    }

    @Test
    public void testIsFullHouse_True() {
        List<Card> hand = TestUtils.getFullHouseHand();

        assertTrue(new FullHouse().isPokerHand(hand));
    }


    @Test
    public void testIsFullHouse_False() {
        List<Card> hand = TestUtils.getHighCardHand();

        assertFalse(new FullHouse().isPokerHand(hand));
    }

    @Test
    public void testIsFlush_True() {
        List<Card> hand = TestUtils.getFlushHand();

        assertTrue(new Flush().isPokerHand(hand));
    }


    @Test
    public void testIsFlush_False() {
        List<Card> hand = TestUtils.getHighCardHand();

        assertFalse(new Flush().isPokerHand(hand));
    }

    @Test
    public void testIsStraight_True() {
        List<Card> hand = TestUtils.getStraightHand();

        assertTrue(new Straight().isPokerHand(hand));
    }


    @Test
    public void testIsStraight_False() {
        List<Card> hand = TestUtils.getHighCardHand();

        assertFalse(new Straight().isPokerHand(hand));
    }

    @Test
    public void testIsThreeOfAKind_True() {
        List<Card> hand = TestUtils.getThreeOfAKindHand();

        assertTrue(new ThreeOfAKind().isPokerHand(hand));
    }


    @Test
    public void testIsThreeOfAKind_False() {
        List<Card> hand = TestUtils.getHighCardHand();

        assertFalse(new ThreeOfAKind().isPokerHand(hand));
    }

    @Test
    public void testIsTwoPair_True() {
        List<Card> hand = TestUtils.getTwoPairHand();

        assertTrue(new TwoPair().isPokerHand(hand));
    }


    @Test
    public void testIsTwoPair_False() {
        List<Card> hand = TestUtils.getHighCardHand();

        assertFalse(new TwoPair().isPokerHand(hand));
    }
}
