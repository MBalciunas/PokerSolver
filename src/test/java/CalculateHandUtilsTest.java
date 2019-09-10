import models.Card;
import models.Symbols;
import models.Values;
import org.junit.Test;
import pokerhands.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class CalculateHandUtilsTest {

    @Test
    public void testCalculateRoyalFlush_True() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.ACE),
                new Card(Symbols.CLUB, Values.KING),
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.CLUB, Values.JACK),
                new Card(Symbols.CLUB, Values.TEN));

        assertTrue(new RoyalFlush().isPokerHand(hand));
    }

    @Test
    public void testCalculateRoyalFlush_False() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.ACE),
                new Card(Symbols.HEART, Values.KING),
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.DIAMOND, Values.JACK),
                new Card(Symbols.CLUB, Values.TEN));

        assertFalse(new RoyalFlush().isPokerHand(hand));
    }

    @Test
    public void testCalculateStraightFlush_True() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.HEART, Values.SIX),
                new Card(Symbols.HEART, Values.TWO),
                new Card(Symbols.HEART, Values.THREE),
                new Card(Symbols.HEART, Values.FIVE),
                new Card(Symbols.HEART, Values.FOUR));

        assertTrue(new StraightFlush().isPokerHand(hand));
    }

    @Test
    public void testCalculateStraightFlush_False() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.ACE),
                new Card(Symbols.HEART, Values.KING),
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.DIAMOND, Values.JACK),
                new Card(Symbols.CLUB, Values.TEN));

        assertFalse(new StraightFlush().isPokerHand(hand));
    }

    @Test
    public void testIsFourOfAKind_True() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.KING),
                new Card(Symbols.HEART, Values.KING),
                new Card(Symbols.CLUB, Values.KING),
                new Card(Symbols.DIAMOND, Values.KING),
                new Card(Symbols.CLUB, Values.TEN));

        assertTrue(new FourOfAKind().isPokerHand(hand));
    }

    @Test
    public void testIsFourOfAKind_False() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.HEART, Values.QUEEN),
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.DIAMOND, Values.KING),
                new Card(Symbols.CLUB, Values.TEN));

        assertFalse(new FourOfAKind().isPokerHand(hand));
    }

    @Test
    public void testIsFullHouse_True() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.HEART, Values.QUEEN),
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.DIAMOND, Values.KING),
                new Card(Symbols.CLUB, Values.KING));

        assertTrue(new FullHouse().isPokerHand(hand));
    }

    @Test
    public void testIsFullHouse_False() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.HEART, Values.QUEEN),
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.DIAMOND, Values.KING),
                new Card(Symbols.CLUB, Values.TEN));

        assertFalse(new FullHouse().isPokerHand(hand));
    }

    @Test
    public void testIsFlush_True() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.HEART, Values.QUEEN),
                new Card(Symbols.HEART, Values.QUEEN),
                new Card(Symbols.HEART, Values.QUEEN),
                new Card(Symbols.HEART, Values.KING),
                new Card(Symbols.HEART, Values.TEN));

        assertTrue(new Flush().isPokerHand(hand));
    }

    @Test
    public void testIsFlush_False() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.HEART, Values.QUEEN),
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.DIAMOND, Values.KING),
                new Card(Symbols.CLUB, Values.TEN));

        assertFalse(new Flush().isPokerHand(hand));
    }

    @Test
    public void testIsStraight_True() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.THREE),
                new Card(Symbols.HEART, Values.FOUR),
                new Card(Symbols.CLUB, Values.SEVEN),
                new Card(Symbols.DIAMOND, Values.FIVE),
                new Card(Symbols.CLUB, Values.SIX));

        assertTrue(new Straight().isPokerHand(hand));
    }

    @Test
    public void testIsStraight_False() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.HEART, Values.FOUR),
                new Card(Symbols.CLUB, Values.KING),
                new Card(Symbols.DIAMOND, Values.FIVE),
                new Card(Symbols.CLUB, Values.SIX));

        assertFalse(new Straight().isPokerHand(hand));
    }

    @Test
    public void testIsThreeOfAKind_True() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.KING),
                new Card(Symbols.HEART, Values.KING),
                new Card(Symbols.CLUB, Values.KING),
                new Card(Symbols.DIAMOND, Values.QUEEN),
                new Card(Symbols.CLUB, Values.TEN));

        assertTrue(new ThreeOfAKind().isPokerHand(hand));
    }

    @Test
    public void testIsThreeOfAKind_False() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.HEART, Values.QUEEN),
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.DIAMOND, Values.QUEEN),
                new Card(Symbols.CLUB, Values.TEN));

        assertFalse(new ThreeOfAKind().isPokerHand(hand));
    }
    @Test
    public void testIsTwoPair_True() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.KING),
                new Card(Symbols.HEART, Values.KING),
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.DIAMOND, Values.QUEEN),
                new Card(Symbols.CLUB, Values.TEN));

        assertTrue(new TwoPair().isPokerHand(hand));
    }

    @Test
    public void testIsTwoPair_False() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.HEART, Values.QUEEN),
                new Card(Symbols.CLUB, Values.KING),
                new Card(Symbols.DIAMOND, Values.JACK),
                new Card(Symbols.CLUB, Values.TEN));

        assertFalse(new TwoPair().isPokerHand(hand));
    }
}
