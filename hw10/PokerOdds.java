//John Luczkovich
//CSE2
//11/17/14

//hw10
//PokerOdds.java

//this program generates a random hand of 5 cards to the user
//the user is prompted if the user would like another hand by entering "Y" or "y"
//after the user does not wish to recieve another hand, a simulation is run
//10000 hands of cards are generated and the number of pairs generated are displayed
//the number of times exactly one pair is not generated is then displayed

import java.util.Random;    //import random 
import java.util.Scanner;   //implort scanner
public class PokerOdds {    //define PokerOdds class
    public static void main(String[] arg) {     //define main method
        showHands();    //call showHands class
        simulateOdds(); //call simulateOdds class 
    }

    public static void showHands() {    //define showHands class
        while (true) {  //loop that runs until told otherwise
            int[] hand = getHand();     //creates an array caled hand and gets values from method get hand
            String[] val = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};  //create string for vals
            Scanner scan = new Scanner(System.in);  //constructs scanner
            System.out.print("Clubs:   ");  //prints clubs to user
            
            for (int g = 0; g < 5; g++) {   //for loop for printing the club values
                if (hand[g] / 13 == 0) {
                    System.out.print(" " + val[hand[g] % 13]);
                }
            }
            System.out.print("\nDiamonds:");    //prints Diamonds to user
            for (int g = 0; g < 5; g++) {       //for loop for printing the diamond values
                if (hand[g] / 13 == 1) {
                    System.out.print(" " + val[hand[g] % 13]);
                }
            }
            System.out.print("\nHearts:  ");    //prints Hearts to user
            for (int g = 0; g < 5; g++) {       //for loop for printing the heart values
                if (hand[g] / 13 == 2) {
                    System.out.print(" " + val[hand[g] % 13]);
                }
            }
            System.out.print("\nSpades:  ");    //prints Spades to user
            for (int g = 0; g < 5; g++) {       //for loop for printing spade values
                if (hand[g] / 13 == 3) {
                    System.out.print(" " + val[hand[g] % 13]);
                }
            }
            System.out.print("\nGo again? Enter 'Y' or 'y', anything else to quit- ");  //promts user if the want another hand
            String input = scan.next();     //gets input from user
            if (!(input.equals("y") || input.equals("Y"))) {    //tests if user's input is y or Y if its not it terminates the method
                return; 
            }
        }
    }

    public static void simulateOdds() {     //defines the method simulateOdds
        int noPair = 0, pairVal = 0;        //define preliminary values
        String[] val = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};  //create array for card vals
        int[] countPairs = new int[13];     //crete an array to keep track of the number of pairs 
        
        for (int q = 0; q < 13; q++) {      //for loop to set values for countPairs array
            countPairs[q] = 0;
        }
        
        for (int i = 0; i < 10000; i++) {   //for loop that simulates 10000 hands and tests for pairs
            int[] hand = getHand();     //calls the method getHand and sets it equal to hand
            for (int j = 0; j < 5; j++) {   //for loop that gets the value of eah card
                hand[j] = hand[j] % 13;
            }
            if (!(FindDuplicates.exactlyOneDup(hand))) {    //tests if there is exactly one pair by calling the exactlyOneDup method from the FindDuplicates class
                noPair++;   //adds one to noPair if there is not exactly one pair
                continue;   //breaks an iteration of a loop
            }

            for (int g = 0; g < 4; g++) {   //for loop that finds what the value of the matching cards is
                for (int k = g + 1; k < 5; k++) {
                    if (hand[k] == hand[g]) {
                        pairVal = hand[k];  //sets the value of pairVal to the matching cards value
                    }
                }
            }
            countPairs[pairVal] = countPairs[pairVal] + 1;  //adds one to the the count of pairs of a specific value
        }
        
        System.out.println(" rank   freq of exactly one pair");     //prints to the user
        for (int t = 0; t < val.length; t++) {      //for loop that prints out the value of the card and the number of pairs
            System.out.printf("  %-7s%-7s%n", val[t], countPairs[t]);
        }
        System.out.println("__________________");   //prints to user
        System.out.println("total not exactly one pair: " + noPair);    //prints the number of times there is not exactly one pair
    }

    public static int[] getHand() {     //defines method getHand
        int[] deck = new int[52];       //creates array deck
        int[] hand = {-1, -1, -1, -1, -1};  //creates array hand

        for (int i = 0; i < 52; i++) {  //sets the value of each card in the deck
            deck[i] = i;
        }

        for (int j = 0, k = 52; j < 5; j++, k--) {  //for loop that gets a hand form the deck
            Random rand = new Random();     //generates a random number
            int card = rand.nextInt(k - j); //sets it equal to card
            hand[j] = deck[card];           //sets the value at the card in position j to the value of the card at the random number in the deck
            deck[card] = deck[k - 1];       //swaps values
        }
        return hand;    //retuns the array hand
    }
}
