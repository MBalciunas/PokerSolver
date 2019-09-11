package pokerhand;

import card.Card;
import pokerhand.pockerhandimpl.*;

import java.util.List;

public class PokerHandFactory {

    public static List<PokerHand> pokerHandMap = List.of(
            new RoyalFlush(),
            new StraightFlush(),
            new FourOfAKind(),
            new FullHouse(),
            new Flush(),
            new Straight(),
            new ThreeOfAKind(),
            new TwoPair(),
            new Pair(),
            new HighCard());


    public static PokerHand getPokerHand(List<Card> hand) {
        return pokerHandMap.stream().filter(pokerHand -> pokerHand.isPokerHand(hand)).findFirst().get();
    }
}
