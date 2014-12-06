//John Luczkovich
//12/3/14
//CSE2
//
//hw11
//PokerHands
//
//this program takes input from the user in the form of cards
//5 cards are collected and then the best possible hand is determined
//the hand is displayed and the user is asked if they would like to put in another hand
//

//import scanner class
import java.util.Scanner;

//define class
public class PokerHands {

    //define main method
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  //declare scanner
        while (true) {  //runs until told otherwise

            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- "); //prompts the user to enter y or Y to continue
            String input = scan.next(); //gets imput from user and stores it
            if (!(input.equals("Y") || input.equals("y"))) {    //tests if user input is  y or Y anything else quits 
                return;     //quits program
            }
            
            int[] hand = {-1, -1, -1, -1, -1};  //declares hand array
            int[] deck = new int[52];   //declares deck array
            for (int i = 0; i < 52; i++) {  //sets a value for each card in the deck 0, 1, 2, ... 51
                deck[i] = i;
            }

            for (int i = 0; i < 5; i++) {   //gets a card for each spot in the hand by calling getCard method
                hand [i] = getCard(scan, hand);
            }
            
            showOneHand(hand);  //calls showOneHand method to print the hand
            System.out.println("This is a " + handVal(hand));   //prints out what the value of the hand is by calling handVal method
        }
    }
    
    //showOneHand method; prints the users hand
    public static void showOneHand(int hand[]) {    //takes an array as a parameter 
        String suit[] = {       //a string array with suits
            "Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
        String face[] = {       //a string array with the card values
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "};
        String out = "";    //declare out string
        for (int s = 0; s < 4; s++) {   //nested for loops that create the string to be printed out
            out += suit[s];     //adds strings from the suit array
            for (int rank = 0; rank < 13; rank++)
                for (int card = 0; card < 5; card++)
                    if (hand[card] / 13 == s && hand[card] % 13 == rank)
                        out += face[rank];  //adds the face values from the face array
            out += '\n';    //added to print to next line
        }
        System.out.println(out);    //prints the cards out
    }
    //getCard method that asks the user to enter their desired card
    public static int getCard(Scanner scan, int [] hand) {  //takes a scanner and an int array
        int card = 0;   //declares variable card
        int sameCard = 0;   //declares variable sameCard
        do {    
            card = 0;       //sets values
            sameCard = 0;
            while (true) {  //loop that gets suit of card runs and continues to run until a valid input
                System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");    //prompts user
                String input = scan.next(); //gets input from user
                if (input.equals("c")) {    //checks if users input is c
                    card += 0;  //adds 0 to card 
                    break;  //breaks from the loop
                } else if (input.equals("d")) {    //checks if user enters d
                    card += 13; //adds 13 to card
                    break;  //breaks from loop
                } else if (input.equals("h")) {     //checks if user enters h
                    card += 26; //adds 26 to card
                    break;  //breaks from the loop
                } else if (input.equals("s")) {     //checks if user enters s
                    card += 39; //adds 39 to card
                    break;  //breaks from the loop
                } else {
                    System.out.println("You did not enter a valid response");   //tells the user the did not enter an valid input 
                }
            }
            while (true) {  //loop that gets card val from user and continues to run until a valid input
                System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");    //promts user
                String input = scan.next(); //gets input
                if (input.equals("a")) {    //checks if input is a
                    card += 0;  //adds 0 to card
                    break;  //breaks from loop
                } else if (input.equals("k")) { //checks if input is k
                    card += 1;  //adds 1 to card
                    break;  //breaks from loop
                } else if (input.equals("q")) { //checks if input is q
                    card += 2;  //adds 2 to card
                    break;  //breaks from loop
                } else if (input.equals("j")) { //checks if input is j
                    card += 3;  //adds 3 to card
                    break;  //breaks from loop
                } else if (input.equals("10")) { //checks if input is 10
                    card += 4;  //adds 4 to card
                    break;  //breaks from loop
                } else if (input.equals("9")) { //checks if input is 9
                    card += 5;  //adds 5 to card
                    break;  //breaks from loop
                } else if (input.equals("8")) { //checks if input is 8
                    card += 6;  //adds 6 to card
                    break;  //breaks from loop
                } else if (input.equals("7")) { //checks if input is 7
                    card += 7;  //adds 7 to card
                    break;  //breaks from loop
                } else if (input.equals("6")) { //checks if input is 6
                    card += 8;  //adds 8 to card
                    break;  //breaks from loop
                } else if (input.equals("5")) { //checks if input is 5
                    card += 9;  //adds 9 to card
                    break;  //breaks from loop
                } else if (input.equals("4")) { //checks if input is 4
                    card += 10; //adds 10 to card
                    break;  //breaks from loop
                } else if (input.equals("3")) { //checks if input is 3
                    card += 11; //adds 11 to card
                    break;  //breaks from loop
                } else if (input.equals("2")) { //checks if input is 2
                    card += 12; //adds 12 to card
                    break;  //breaks from loop
                } else {
                    System.out.println("You did not enter a valid response");   //tells user that they didnt enter a valid input
                }
            }
            for (int j = 0; j < 5; j++) {   //for loop that checks if the user entered a card that was already entered
                if (hand[j] == card) {
                    System.out.println("You already entered that card");    //tells user they already entered that card
                    sameCard++; //adds to the same card value
                }
            }
        } while (sameCard != 0);    //if the u ser entered a card that was already entered the loop continues to run to get a new card
        return card;    //returns the card the user entered
    }
    //handVal method that determines the value of the hand
    public static String handVal(int [] hand) { 
        int [] valFreq = new int[13];   //creates an array for the frequency of the values of the hand
        int [] suitFreq = new int[4];   //creates an array for the frequency of the suits of the hand
        for (int i = 0; i < 13; i++) {  //sets each value in the array equal to 0
            valFreq[i] = 0;
        }
        for (int i = 0; i < 4; i++) {   //sets each value in the array equal to 0
            suitFreq[i] = 0; 
        }
        for(int i = 0; i < 5; i++) {    //counts the frequency of each value
            int val = hand[i] % 13;
            valFreq[val]++;
        }
        for(int i = 0; i < 5; i++) {    //counts the frequency of each suit
            int suit = hand[i] / 13;
            suitFreq[suit]++;
        }
        //the next section of code determines what the hand is
        if (valFreq[0] == 1 && valFreq[1] == 1 && straight(valFreq) == true && flush(suitFreq) == true) { //tests for royal flush by calling the straight and flush method and that the first two cards are an A and K
            return "Royal Flush";   //returns royal flush
        } else
        if (straight(valFreq) == true && flush(suitFreq) == true) { //tests for straight flush by calling flush and straight methods
            return "Straight Flush";    //returns straight flush
        } else
        if (four(valFreq) == true) {    //tests for for of a kind by calling four method
            return "Four of a Kind";    //returns four of a kind
        } else
        if (three(valFreq) == true && pair(valFreq) == true) {  //tests for full house by calling three method and pair method
            return "Full House";    //returns full house
        } else
        if (flush(suitFreq) == true) {  //tests for a flush by calling flush method
            return "Flush"; //returns flush
        } else
        if (straight(valFreq) == true) {    //tests ofr straight by calling straight method
            return "Straight";  //returns straight
        } else
        if (three(valFreq) == true) {   //tests for three of a kind by calling three method
            return "Three of a Kind";   //returns three of a kind
        } else
        if (twoPair(valFreq) == true) { //tests for two pair by calling twoPair method
            return "Two Pair";  //returns two pair
        } else
        if (pair(valFreq) == true) {    //tests if there is a pair by calling pair method
            return "Pair";  //retruns pair
        } else {
            return "High Card"; //returns high card if nothing is found
        }
    }
    //flush method that tests if there is a flush
    public static Boolean flush(int[] suitFreq) {   //takes parameter of an array
        for (int i = 0; i < 4; i++) {   //for loop that tests if the suit frequency array equals 5 at any point
            if (suitFreq[i] == 5){
                return true;    //returns true if a 5 is found
            }
        }
        return false;   //returns false if not
    }
    //straight method that tests if there is a straight
    public static Boolean straight(int[] valFreq) { //takes parameters of an array
        int i;  //declares variable
        for (i = 0; i < 9; i++) {   //searches for the first point where there is exactly one card
            if (valFreq[i] == 1) { 
                break;
            }
        }
        for (int j = i + 1; j < i + 5; j++) {   //tests if there is exactly one card in the next for subsequint positions
            if (valFreq[j] != 1) {  //if there isnt exactly one card in the next 4 positions
                return false;       //  then returns false
            }
        }
        return true;    //returns true
    }
    //four method that tests if there is a four of a kind
    public static Boolean four(int[] valFreq) { //takes an int array
        for (int i = 0; i < 13; i++) {  //tests if there is exactly four values at a position
            if (valFreq[i] == 4) {
                return true;    //returns true
            }
        }
        return false;   //returns false
    }
    //three method that tests if there is a three of a kind
    public static Boolean three(int[] valFreq) {    //takes an int array
        for (int i = 0; i < 13; i++) {  //tests if there is exactly 3 values at a position
            if (valFreq[i] == 3) {
                return true;    //returns true
            }
        }
        return false;   //returns false
    }
    //pair method that tests if there is a pair
    public static Boolean pair(int[] valFreq) { //takes a int array
        for (int i = 0; i < 13; i++) {  //tests if there are exactly 2 values at a position
            if (valFreq[i] == 2) {
                return true;    //returns true
            }
        }
        return false;   //returns false
    }
    //twoPair method that tests if there is two pairs
    public static Boolean twoPair(int[] valFreq) {  //takes an int array
        for (int i = 0; i < 12; i++) {  //tests if there is exactly 2 values at a position
            if (valFreq[i] == 2) {
                for (int j = i + 1; j < 13; j++) {  //tests if there are exaclty 2 values at some point after the first 2
                    if (valFreq[j] == 2) {
                        return true;    //returns true
                    }
                }
            }
        }
        return false;   //returns false
    }
    
}