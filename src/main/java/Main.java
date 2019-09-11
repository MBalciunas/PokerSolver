import card.Card;
import enums.CardSymbols;
import enums.CardValues;
import pokerhand.PokerHand;
import pokerhand.PokerHandFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanIn = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            List<Card> firstHand = new ArrayList<>();
            List<Card> secondHand = new ArrayList<>();
            fillHandWithCards(firstHand, "first");
            fillHandWithCards(secondHand, "second");

            PokerHand firstPokerHand = PokerHandFactory.getPokerHand(firstHand);
            PokerHand secondPokerHand = PokerHandFactory.getPokerHand(secondHand);

            if(firstPokerHand.getPokerHand().ordinal() > secondPokerHand.getPokerHand().ordinal()) {
                System.out.println(String.format("First hand wins with %s vs %s", firstPokerHand.getPokerHand(), secondPokerHand.getPokerHand()));
            }
            else if(firstPokerHand.getPokerHand().ordinal() < secondPokerHand.getPokerHand().ordinal()) {
                System.out.println(String.format("Second hand wins with %s vs %s", secondPokerHand.getPokerHand(), firstPokerHand.getPokerHand()));
            }
            else {
                //TODO implement compare method for every poker hand.
                System.out.println("It's a tie!");
            }

            System.out.println("Play again? y/n");
            String answer = scanIn.nextLine();

            if(!answer.toLowerCase().equals("y")) {
                break;
            }
        }
        System.out.println("Goodbye!, come to play again :).");
    }

    private static void fillHandWithCards(List<Card> hand, String number) {
        for(int i = 0; i < 5; i++) {
            System.out.println(String.format("Enter CardSymbols and value for %s hand cards, for example: heart king", number));
            String[] cardAsString = scanIn.nextLine().split(" ");
            try {
                Card card = new Card(CardSymbols.valueOf(cardAsString[0].toUpperCase()),
                        CardValues.valueOf(cardAsString[1].toUpperCase()));
                hand.add(card);
            }
            catch (Exception e) {
                System.out.println("Wrong input, try again.");
                i--;
            }
        }
    }
}
