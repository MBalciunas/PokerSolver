import card.Card;
import org.junit.Test;
import pokerhand.pockerhandimpl.*;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ComparePokerHandTest {

    @Test
    public void testRoyalFlushCompare() {
        List<Card> firstHand = TestUtils.getRoyalFlushHand();
        List<Card> secondHand = TestUtils.getRoyalFlushHand();

        int compareResult = new RoyalFlush().compare(firstHand, secondHand);

        assertEquals(0, compareResult);
    }

    @Test
    public void testStraightFlushCompare_firstWin() {
        List<Card> firstHand = TestUtils.getBestStraightFlushHand();
        List<Card> secondHand = TestUtils.getStraightFlushHand();

        int compareResult = new StraightFlush().compare(firstHand, secondHand);

        assertEquals(1, compareResult);
    }

    @Test
    public void testStraightFlushCompare_Draw() {
        List<Card> firstHand = TestUtils.getBestStraightFlushHand();
        List<Card> secondHand = TestUtils.getBestStraightFlushHand();

        int compareResult = new StraightFlush().compare(firstHand, secondHand);

        assertEquals(0, compareResult);
    }
    @Test
    public void testStraightFlushCompare_SecondWin() {
        List<Card> firstHand = TestUtils.getStraightFlushHand();
        List<Card> secondHand = TestUtils.getBestStraightFlushHand();

        int compareResult = new StraightFlush().compare(firstHand, secondHand);

        assertEquals(-1, compareResult);
    }

    @Test
    public void testStraightFourOfAKind_firstWin() {
        List<Card> firstHand = TestUtils.getBestFourOfAKindHand();
        List<Card> secondHand = TestUtils.getFourOfAKindHand();

        int compareResult = new FourOfAKind().compare(firstHand, secondHand);

        assertEquals(1, compareResult);
    }

    @Test
    public void testStraightFourOfAKind_Draw() {
        List<Card> firstHand = TestUtils.getBestFourOfAKindHand();
        List<Card> secondHand = TestUtils.getBestFourOfAKindHand();

        int compareResult = new FourOfAKind().compare(firstHand, secondHand);

        assertEquals(0, compareResult);
    }
    @Test
    public void testStraightFourOfAKind_secondWin() {
        List<Card> firstHand = TestUtils.getFourOfAKindHand();
        List<Card> secondHand = TestUtils.getBestFourOfAKindHand();

        int compareResult = new FourOfAKind().compare(firstHand, secondHand);

        assertEquals(-1, compareResult);
    }

    @Test
    public void testFullHouse_firstWin() {
        List<Card> firstHand = TestUtils.getBestFullHouseHand();
        List<Card> secondHand = TestUtils.getFullHouseHand();

        int compareResult = new FullHouse().compare(firstHand, secondHand);

        assertEquals(1, compareResult);
    }

    @Test
    public void testFullHouse_Draw() {
        List<Card> firstHand = TestUtils.getBestFullHouseHand();
        List<Card> secondHand = TestUtils.getBestFullHouseHand();

        int compareResult = new FullHouse().compare(firstHand, secondHand);

        assertEquals(0, compareResult);
    }
    @Test
    public void testFullHouse_secondWin() {
        List<Card> firstHand = TestUtils.getFullHouseHand();
        List<Card> secondHand = TestUtils.getBestFullHouseHand();

        int compareResult = new FullHouse().compare(firstHand, secondHand);

        assertEquals(-1, compareResult);
    }

    @Test
    public void testFlush_firstWin() {
        List<Card> firstHand = TestUtils.getBestFlushHand();
        List<Card> secondHand = TestUtils.getFlushHand();

        int compareResult = new Flush().compare(firstHand, secondHand);

        assertEquals(1, compareResult);
    }

    @Test
    public void testFlush_Draw() {
        List<Card> firstHand = TestUtils.getBestFlushHand();
        List<Card> secondHand = TestUtils.getBestFlushHand();

        int compareResult = new Flush().compare(firstHand, secondHand);

        assertEquals(0, compareResult);
    }
    @Test
    public void testFlush_secondWin() {
        List<Card> firstHand = TestUtils.getFlushHand();
        List<Card> secondHand = TestUtils.getBestFlushHand();

        int compareResult = new Flush().compare(firstHand, secondHand);

        assertEquals(-1, compareResult);
    }

    @Test
    public void testStraight_firstWin() {
        List<Card> firstHand = TestUtils.getBestStraightHand();
        List<Card> secondHand = TestUtils.getStraightHand();

        int compareResult = new Straight().compare(firstHand, secondHand);

        assertEquals(1, compareResult);
    }

    @Test
    public void testStraight_Draw() {
        List<Card> firstHand = TestUtils.getBestStraightHand();
        List<Card> secondHand = TestUtils.getBestStraightHand();

        int compareResult = new Straight().compare(firstHand, secondHand);

        assertEquals(0, compareResult);
    }
    @Test
    public void testStraight_secondWin() {
        List<Card> firstHand = TestUtils.getStraightHand();
        List<Card> secondHand = TestUtils.getBestStraightHand();

        int compareResult = new Straight().compare(firstHand, secondHand);

        assertEquals(-1, compareResult);
    }

    @Test
    public void testThreeOfAKind_firstWin() {
        List<Card> firstHand = TestUtils.getBestThreeOfAKindHand();
        List<Card> secondHand = TestUtils.getThreeOfAKindHand();

        int compareResult = new ThreeOfAKind().compare(firstHand, secondHand);

        assertEquals(1, compareResult);
    }

    @Test
    public void testThreeOfAKind_Draw() {
        List<Card> firstHand = TestUtils.getBestThreeOfAKindHand();
        List<Card> secondHand = TestUtils.getBestThreeOfAKindHand();

        int compareResult = new ThreeOfAKind().compare(firstHand, secondHand);

        assertEquals(0, compareResult);
    }
    @Test
    public void testThreeOfAKind_secondWin() {
        List<Card> firstHand = TestUtils.getThreeOfAKindHand();
        List<Card> secondHand = TestUtils.getBestThreeOfAKindHand();

        int compareResult = new ThreeOfAKind().compare(firstHand, secondHand);

        assertEquals(-1, compareResult);
    }

    @Test
    public void testTwoPair_firstWin() {
        List<Card> firstHand = TestUtils.getBestTwoPairHand();
        List<Card> secondHand = TestUtils.getTwoPairHand();

        int compareResult = new TwoPair().compare(firstHand, secondHand);

        assertEquals(1, compareResult);
    }

    @Test
    public void testTwoPair_Draw() {
        List<Card> firstHand = TestUtils.getBestTwoPairHand();
        List<Card> secondHand = TestUtils.getBestTwoPairHand();

        int compareResult = new TwoPair().compare(firstHand, secondHand);

        assertEquals(0, compareResult);
    }
    @Test
    public void testTwoPair_secondWin() {
        List<Card> firstHand = TestUtils.getTwoPairHand();
        List<Card> secondHand = TestUtils.getBestTwoPairHand();

        int compareResult = new TwoPair().compare(firstHand, secondHand);

        assertEquals(-1, compareResult);
    }

    @Test
    public void testPair_firstWin() {
        List<Card> firstHand = TestUtils.getBestPairHand();
        List<Card> secondHand = TestUtils.getPairHand();

        int compareResult = new Pair().compare(firstHand, secondHand);

        assertEquals(1, compareResult);
    }

    @Test
    public void testPair_Draw() {
        List<Card> firstHand = TestUtils.getBestPairHand();
        List<Card> secondHand = TestUtils.getBestPairHand();

        int compareResult = new Pair().compare(firstHand, secondHand);

        assertEquals(0, compareResult);
    }
    @Test
    public void testPair_secondWin() {
        List<Card> firstHand = TestUtils.getPairHand();
        List<Card> secondHand = TestUtils.getBestPairHand();

        int compareResult = new Pair().compare(firstHand, secondHand);

        assertEquals(-1, compareResult);
    }

    @Test
    public void testHighCard_firstWin() {
        List<Card> firstHand = TestUtils.getBestHighCardHand();
        List<Card> secondHand = TestUtils.getHighCardHand();

        int compareResult = new HighCard().compare(firstHand, secondHand);

        assertEquals(1, compareResult);
    }

    @Test
    public void testHighCard_Draw() {
        List<Card> firstHand = TestUtils.getBestHighCardHand();
        List<Card> secondHand = TestUtils.getBestHighCardHand();

        int compareResult = new HighCard().compare(firstHand, secondHand);

        assertEquals(0, compareResult);
    }
    @Test
    public void testHighCard_secondWin() {
        List<Card> firstHand = TestUtils.getHighCardHand();
        List<Card> secondHand = TestUtils.getBestHighCardHand();

        int compareResult = new HighCard().compare(firstHand, secondHand);

        assertEquals(-1, compareResult);
    }
}
