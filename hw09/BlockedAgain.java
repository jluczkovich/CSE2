//John Luczkovich
//CSE2
//11/1/14
//
//hw09
//BlockedAgain
//
//this program prompts the user to enter an int within the range of [1, 9]
//the program prompts the user through the use of the method getInt
//getInt checks the user's input by calling the method's checkInt and checkRange
//checkInt tests the user's input to see if it is an int
//checkRange tests if the the user's input is in the range of [1, 9]
//the user's number is then used to call the method allBlocks
//allBlocks controls the number of blocks of numbers are printed
//allBlocks calls block which controls the printing of each block of numbers
//block calls line which controls the printing of each line
//a sample of a print for this program when the user enters 4 is:
//   1
//   -
//  222
//  222
//  ---
// 33333
// 33333
// 33333
// -----
//4444444
//4444444
//4444444
//4444444
//-------

//import the scanner class
import java.util.Scanner;

//define class
public class BlockedAgain {

    //define method getInt
    public static int getInt() {
        //call scanner constructor and declare scanner
        Scanner scan = new Scanner(System.in);
        //declare and set preliminary value for usernumber
        int userNumber = 0;
        //prompt user to enter an int within [1, 9]
        System.out.print("Enter an int between 1 and 9, inclusive: ");
        //while loop that will continue to run
        while (true) {
            //while loop that runs until the method check int returns true
            while (checkInt(scan) == false) {
                scan.next();    //removes the input of the user
                System.out.print("You did not enter an int; try again: ");  //prompts the user to enter an int
            }
            //stores the user's input
            userNumber = scan.nextInt();
            //tests if the user's number fits within the range of [1,9]
            //and if not rerun the loop
            if (checkRange(userNumber) == false) {
                System.out.print("You did not enter an int in [1, 9]; try agian: ");
                continue;
            }
            //returns the user's input when it has been tested to see if it valid
            return userNumber;
        }
    }
    //define method checkInt for parameter Scanner scan
    public static boolean checkInt(Scanner scan) {
        if (scan.hasNextInt()) {    //tests if input is an int
            return true;    //output from the method is true
        }
        else {
            return false;   //output from the method is false
        }
    }
    //define method check range for parameter int x
    public static boolean checkRange(int x) {
        if (x <= 9 && x >= 1) { //tests if inout is less than or equal to 9 and greater than or equal to 1
            return true;    //output from method is true
        }
        else {
            return false;   //output from method is false
        }
    }
    //define method allBlocks for parameter int x 
    public static void allBlocks(int x) {
        for (int i = 1; i < x + 1; i++) {   //for loop that sets i equal to 1, tests if i is less that the parameter x, and increments i
            block(i, x);    //calls method blocks for parameters i and x
        }
    }
    //define method block for parameter int i and int x
    public static void block(int i, int x) {
        String q = "" + i;  //makes a string with the value of i
        for (int a = 0; a < i; a++) {   //for loop that sets a equal to 0, tests if a is less than i, and increments a
            line(i, x, q);  //calls method line for i, x, and q
        }
        q = "-";    //sets q equal to "-"
        line(i, x, q);  //calls the method line for i, x, and q
    }
    //define the method line for parameters int i, int x, and string q
    public static void line(int i, int x, String q) {
        int b = 0; //sets b equal to 0
        for (int n = 0; n < x - i; n++) {   //for loop that sets n equal to 0, tests if n is less than x minus i, and increments n
            System.out.print(" ");  //prints a space
        }
        for (b = 0; b < i; b++) {   //for loop that sets b equal to 0, tests if b is less than i, and increments b
            System.out.print(q);    //prints string q each time the loop runs
        }
        for (int g = 1; g < b; b--) {   //for loop that sets g equal to 1, tests if g is less than b, and decrements b
            System.out.print(q);    //prints string q for each run of the loop
        }
        System.out.println();   //starts a new line
    }

    //define main method
    public static void main(String[] s) {
        int m;  //declare variable m
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);   //call method allBlocks
    }
}
