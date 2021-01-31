/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Petros Malevris
 * Student #991247545
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {

    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            //Random class to generate card values at random
            Random value = new Random();
            int valueBound = 14;
            int randValue = value.nextInt(valueBound);
            //Random class to generate card Suit at random
            Random rSuit = new Random();
            int suitBound = 4;
            int randSuit = rSuit.nextInt(suitBound);
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue(randValue);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[randSuit]);
            System.out.println(c.getValue() + " of " + c.getSuit());
        }
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Pick a card, any card "
                            +"\nNumber: ");
        Card user = new Card();
        user.setValue(intInput());
        System.out.println("Pick a suit (0 = Hearts, 1 = Diamonds, 2 = Spades, 3 = Clubs): ");
        user.setSuit(Card.SUITS[intInput()]);
        System.out.println("Your card is the " + user.getValue() + " of " +
                user.getSuit());
        // and search magicHand here
        
    }
    
    /**
     * Prompts the user to enter a number and only a number and will cycle until
     * a number has been given
     * @return number
     */
    public static int intInput() {
        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        while (!keyboard.hasNextInt()) {
            keyboard.next();
            System.out.print("Please enter a number: ");
        }
        try {
            number = keyboard.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Only numbers are allowed.");
        }
        return number;
    }

}
