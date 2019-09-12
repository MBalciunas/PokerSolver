import card.Card;
import enums.CardSymbols;
import enums.CardValues;

import java.util.Arrays;
import java.util.List;

public class TestUtils {

    public static List<Card> getRoyalFlushHand() {
        return Arrays.asList(
                new Card(CardSymbols.CLUB, CardValues.ACE),
                new Card(CardSymbols.CLUB, CardValues.KING),
                new Card(CardSymbols.CLUB, CardValues.QUEEN),
                new Card(CardSymbols.CLUB, CardValues.JACK),
                new Card(CardSymbols.CLUB, CardValues.TEN));
    }

    public static List<Card> getStraightFlushHand() {
        return Arrays.asList(
                new Card(CardSymbols.HEART, CardValues.SIX),
                new Card(CardSymbols.HEART, CardValues.TWO),
                new Card(CardSymbols.HEART, CardValues.THREE),
                new Card(CardSymbols.HEART, CardValues.FIVE),
                new Card(CardSymbols.HEART, CardValues.FOUR));
    }

    public static List<Card> getBestStraightFlushHand() {
        return Arrays.asList(
                new Card(CardSymbols.HEART, CardValues.NINE),
                new Card(CardSymbols.HEART, CardValues.JACK),
                new Card(CardSymbols.HEART, CardValues.QUEEN),
                new Card(CardSymbols.HEART, CardValues.KING),
                new Card(CardSymbols.HEART, CardValues.TEN));
    }

    public static List<Card> getFourOfAKindHand() {
        return Arrays.asList(
                new Card(CardSymbols.CLUB, CardValues.KING),
                new Card(CardSymbols.HEART, CardValues.KING),
                new Card(CardSymbols.CLUB, CardValues.KING),
                new Card(CardSymbols.DIAMOND, CardValues.KING),
                new Card(CardSymbols.CLUB, CardValues.TEN));
    }

    public static List<Card> getBestFourOfAKindHand() {
        return Arrays.asList(
                new Card(CardSymbols.CLUB, CardValues.ACE),
                new Card(CardSymbols.HEART, CardValues.ACE),
                new Card(CardSymbols.CLUB, CardValues.ACE),
                new Card(CardSymbols.DIAMOND, CardValues.ACE),
                new Card(CardSymbols.CLUB, CardValues.KING));
    }

    public static List<Card> getFullHouseHand() {
        return Arrays.asList(
                new Card(CardSymbols.CLUB, CardValues.QUEEN),
                new Card(CardSymbols.HEART, CardValues.QUEEN),
                new Card(CardSymbols.CLUB, CardValues.QUEEN),
                new Card(CardSymbols.DIAMOND, CardValues.KING),
                new Card(CardSymbols.CLUB, CardValues.KING));
    }

    public static List<Card> getBestFullHouseHand() {
        return Arrays.asList(
                new Card(CardSymbols.CLUB, CardValues.ACE),
                new Card(CardSymbols.HEART, CardValues.ACE),
                new Card(CardSymbols.CLUB, CardValues.ACE),
                new Card(CardSymbols.DIAMOND, CardValues.KING),
                new Card(CardSymbols.CLUB, CardValues.KING));
    }

    public static List<Card> getFlushHand() {
        return Arrays.asList(
                new Card(CardSymbols.HEART, CardValues.QUEEN),
                new Card(CardSymbols.HEART, CardValues.QUEEN),
                new Card(CardSymbols.HEART, CardValues.QUEEN),
                new Card(CardSymbols.HEART, CardValues.KING),
                new Card(CardSymbols.HEART, CardValues.TEN));
    }

    public static List<Card> getBestFlushHand() {
        return Arrays.asList(
                new Card(CardSymbols.HEART, CardValues.ACE),
                new Card(CardSymbols.HEART, CardValues.ACE),
                new Card(CardSymbols.HEART, CardValues.ACE),
                new Card(CardSymbols.HEART, CardValues.KING),
                new Card(CardSymbols.HEART, CardValues.QUEEN));
    }

    public static List<Card> getStraightHand() {
        return Arrays.asList(
                new Card(CardSymbols.CLUB, CardValues.THREE),
                new Card(CardSymbols.HEART, CardValues.FOUR),
                new Card(CardSymbols.CLUB, CardValues.SEVEN),
                new Card(CardSymbols.DIAMOND, CardValues.FIVE),
                new Card(CardSymbols.CLUB, CardValues.SIX));
    }

    public static List<Card> getBestStraightHand() {
        return Arrays.asList(
                new Card(CardSymbols.CLUB, CardValues.ACE),
                new Card(CardSymbols.HEART, CardValues.KING),
                new Card(CardSymbols.CLUB, CardValues.QUEEN),
                new Card(CardSymbols.DIAMOND, CardValues.JACK),
                new Card(CardSymbols.CLUB, CardValues.TEN));
    }

    public static List<Card> getThreeOfAKindHand() {
        return Arrays.asList(
                new Card(CardSymbols.CLUB, CardValues.THREE),
                new Card(CardSymbols.HEART, CardValues.THREE),
                new Card(CardSymbols.CLUB, CardValues.THREE),
                new Card(CardSymbols.DIAMOND, CardValues.FIVE),
                new Card(CardSymbols.CLUB, CardValues.SIX));
    }

    public static List<Card> getBestThreeOfAKindHand() {
        return Arrays.asList(
                new Card(CardSymbols.CLUB, CardValues.ACE),
                new Card(CardSymbols.HEART, CardValues.ACE),
                new Card(CardSymbols.CLUB, CardValues.ACE),
                new Card(CardSymbols.DIAMOND, CardValues.KING),
                new Card(CardSymbols.CLUB, CardValues.QUEEN));
    }

    public static List<Card> getTwoPairHand() {
        return Arrays.asList(
                new Card(CardSymbols.CLUB, CardValues.KING),
                new Card(CardSymbols.HEART, CardValues.KING),
                new Card(CardSymbols.CLUB, CardValues.QUEEN),
                new Card(CardSymbols.DIAMOND, CardValues.QUEEN),
                new Card(CardSymbols.CLUB, CardValues.TEN));
    }

    public static List<Card> getBestTwoPairHand() {
        return Arrays.asList(
                new Card(CardSymbols.CLUB, CardValues.ACE),
                new Card(CardSymbols.HEART, CardValues.ACE),
                new Card(CardSymbols.CLUB, CardValues.KING),
                new Card(CardSymbols.DIAMOND, CardValues.KING),
                new Card(CardSymbols.CLUB, CardValues.QUEEN));
    }

    public static List<Card> getPairHand() {
        return Arrays.asList(
                new Card(CardSymbols.CLUB, CardValues.THREE),
                new Card(CardSymbols.HEART, CardValues.FOUR),
                new Card(CardSymbols.CLUB, CardValues.FOUR),
                new Card(CardSymbols.DIAMOND, CardValues.TEN),
                new Card(CardSymbols.CLUB, CardValues.SIX));
    }

    public static List<Card> getBestPairHand() {
        return Arrays.asList(
                new Card(CardSymbols.CLUB, CardValues.ACE),
                new Card(CardSymbols.HEART, CardValues.ACE),
                new Card(CardSymbols.CLUB, CardValues.KING),
                new Card(CardSymbols.DIAMOND, CardValues.QUEEN),
                new Card(CardSymbols.CLUB, CardValues.JACK));
    }

    public static List<Card> getHighCardHand() {
        return Arrays.asList(
                new Card(CardSymbols.CLUB, CardValues.TWO),
                new Card(CardSymbols.HEART, CardValues.SEVEN),
                new Card(CardSymbols.SPADE, CardValues.QUEEN),
                new Card(CardSymbols.SPADE, CardValues.KING),
                new Card(CardSymbols.CLUB, CardValues.SIX));
    }
    public static List<Card> getBestHighCardHand() {
        return Arrays.asList(
                new Card(CardSymbols.CLUB, CardValues.ACE),
                new Card(CardSymbols.HEART, CardValues.KING),
                new Card(CardSymbols.SPADE, CardValues.QUEEN),
                new Card(CardSymbols.SPADE, CardValues.JACK),
                new Card(CardSymbols.CLUB, CardValues.NINE));
    }
}
