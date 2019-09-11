import models.Card;
import models.Symbols;
import models.Values;

import java.util.Arrays;
import java.util.List;

public class TestUtils {

    public static List<Card> getRoyalFlushHand() {
        return Arrays.asList(
                new Card(Symbols.CLUB, Values.ACE),
                new Card(Symbols.CLUB, Values.KING),
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.CLUB, Values.JACK),
                new Card(Symbols.CLUB, Values.TEN));
    }

    public static List<Card> getStraightFlushHand() {
        return Arrays.asList(
                new Card(Symbols.HEART, Values.SIX),
                new Card(Symbols.HEART, Values.TWO),
                new Card(Symbols.HEART, Values.THREE),
                new Card(Symbols.HEART, Values.FIVE),
                new Card(Symbols.HEART, Values.FOUR));
    }

    public static List<Card> getFourOfAKindHand() {
        return Arrays.asList(
                new Card(Symbols.CLUB, Values.KING),
                new Card(Symbols.HEART, Values.KING),
                new Card(Symbols.CLUB, Values.KING),
                new Card(Symbols.DIAMOND, Values.KING),
                new Card(Symbols.CLUB, Values.TEN));
    }

    public static List<Card> getFullHouseHand() {
        return Arrays.asList(
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.HEART, Values.QUEEN),
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.DIAMOND, Values.KING),
                new Card(Symbols.CLUB, Values.KING));
    }

    public static List<Card> getFlushHand() {
        return Arrays.asList(
                new Card(Symbols.HEART, Values.QUEEN),
                new Card(Symbols.HEART, Values.QUEEN),
                new Card(Symbols.HEART, Values.QUEEN),
                new Card(Symbols.HEART, Values.KING),
                new Card(Symbols.HEART, Values.TEN));
    }

    public static List<Card> getStraightHand() {
        return Arrays.asList(
                new Card(Symbols.CLUB, Values.THREE),
                new Card(Symbols.HEART, Values.FOUR),
                new Card(Symbols.CLUB, Values.SEVEN),
                new Card(Symbols.DIAMOND, Values.FIVE),
                new Card(Symbols.CLUB, Values.SIX));
    }

    public static List<Card> getThreeOfAKindHand() {
        return Arrays.asList(
                new Card(Symbols.CLUB, Values.THREE),
                new Card(Symbols.HEART, Values.THREE),
                new Card(Symbols.CLUB, Values.THREE),
                new Card(Symbols.DIAMOND, Values.FIVE),
                new Card(Symbols.CLUB, Values.SIX));
    }

    public static List<Card> getTwoPairHand() {
        return Arrays.asList(
                new Card(Symbols.CLUB, Values.KING),
                new Card(Symbols.HEART, Values.KING),
                new Card(Symbols.CLUB, Values.QUEEN),
                new Card(Symbols.DIAMOND, Values.QUEEN),
                new Card(Symbols.CLUB, Values.TEN));
    }

    public static List<Card> getPairHand() {
        return Arrays.asList(
                new Card(Symbols.CLUB, Values.THREE),
                new Card(Symbols.HEART, Values.FOUR),
                new Card(Symbols.CLUB, Values.FOUR),
                new Card(Symbols.DIAMOND, Values.TEN),
                new Card(Symbols.CLUB, Values.SIX));
    }

    public static List<Card> getHighCardHand() {
        return Arrays.asList(
                new Card(Symbols.CLUB, Values.TWO),
                new Card(Symbols.HEART, Values.SEVEN),
                new Card(Symbols.SPADE, Values.QUEEN),
                new Card(Symbols.SPADE, Values.KING),
                new Card(Symbols.CLUB, Values.SIX));
    }
}
