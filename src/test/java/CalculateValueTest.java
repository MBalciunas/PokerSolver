import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class CalculateValueTest {

    @Test
    public void testCalculateRoyalFlush_True() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.ACE),
                new Card(Symbols.CLUB, Values.KING),
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.CLUB, Values.JACK),
                new Card(Symbols.CLUB, Values.TEN));

        assertTrue(CalculateValue.isRoyalFlush(hand));
    }

    @Test
    public void testCalculateRoyalFlush_False() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.ACE),
                new Card(Symbols.HEART, Values.KING),
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.DIAMOND, Values.JACK),
                new Card(Symbols.CLUB, Values.TEN));

        assertFalse(CalculateValue.isRoyalFlush(hand));
    }

    @Test
    public void testCalculateStraightFlush_True() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.HEART, Values.SIX),
                new Card(Symbols.HEART, Values.TWO),
                new Card(Symbols.HEART, Values.THREE),
                new Card(Symbols.HEART, Values.FIVE),
                new Card(Symbols.HEART, Values.FOUR));

        assertTrue(CalculateValue.isStraightFlush(hand));
    }

    @Test
    public void testCalculateStraightFlush_False() {
        List<Card> hand = Arrays.asList(
                new Card(Symbols.CLUB, Values.ACE),
                new Card(Symbols.HEART, Values.KING),
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.DIAMOND, Values.JACK),
                new Card(Symbols.CLUB, Values.TEN));

        assertFalse(CalculateValue.isStraightFlush(hand));
    }
}
