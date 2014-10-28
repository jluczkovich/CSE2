//John Luczkovich
//10/19/14
//CSE2
//
//hw07
//NumberStack
//
//this program prompts the user to enter an int between 1 and 9 inclusive and then uses for, while, and do-while loops
//to print a pattern of numbers according to the users number
//an example of this output for the input of 4 is:
//      1
//      -
//     222
//     222
//     ---
//    33333
//    33333
//    33333
//    -----
//   4444444
//   4444444
//   4444444
//   4444444
//   -------

//import the scanner class
import java.util.Scanner;

//define class
public class NumberStack {

    //define main method
    public static void main(String[] args) {

        //declare scanner
        Scanner scan;

        //call scanner condtructor
        scan = new Scanner(System.in);

        //prompt user to enter a number between 1 and 9
        System.out.print("Enter an int between 1 and 9- ");


        //tests to see if the user enters an int and prompts them to enter a new number
        //if it was not an int
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.print("You did not enter an int between 1 and 9. Try again- ");
        }

        //stores then user's number as an int

        int userNumber = scan.nextInt();

        //tests if the user enters a number between 1 and 9 inclusive and ends the program
        //if not
        if (!(userNumber > 0 && userNumber < 10)) {
            System.out.println("You did not enter an int between 1 and 9");
            return;
        }

        //output to tell user it is done using for loops
        System.out.println("Using for loops");

        //declaration of variables and set preliminary values
        int i = 0;
        int n = 0;
        int j = 0;
        int k = 0;
        int f = 0;
        int d = 0;

        //nested for loops that print out a pattern for the user's input in the form
        /*      1
                -
               222
               222
               ---
              33333
              33333
              33333
              -----
        */

        for (i = 1; i < userNumber + 1; i++) { //sets i = 1, tests for if i is less than the user number, adds one after each run
            for (d = 0; d < i; d++) { //sets d = 0, tests if d is less than i, adds one to d after it runs
                for (n = 0; n < userNumber - i; n++) { //sets n = 0, tests if n is less than the usernumber, adds one to n after each run
                    System.out.print(" "); //prints a space for every time it runs
                }
                for (j = 0; j < i; j++) { //sets j = 0, tests if j is less than i, adds one to j after each run
                    System.out.print(i); //prints the value for i
                }
                for (k = 1; k < j; j--) { //sets k = 1, tests if k is less than j, subtracts one from j
                    System.out.print(i); //prints value for i
                }
                System.out.println(); //starts a new line
            }
            for (n = 0; n < userNumber - i; n++) { //sets n = 0, tests if n is less than the usernumber minus i, adds one to n after each run
                System.out.print(" "); //prints a space
            }
            for (j = 0; j < i; j++) { //sets j = 0, tests if j is less than i, adds one to j after each run
                System.out.print("-"); //prints a minus sign
            }
            for (k = 1; k < j; j--) { //sets k = 1, tests if k is less than j, subtracts one after each run
                System.out.print("-"); //prints a minus sign
            }
            System.out.println(); //starts a new line
        }

        //tells user that it will print using while loops
        System.out.println("Using while loops");

        //nested while loops that print the same example of code as above
        i = 1; //sets i = 1
        while (i < userNumber + 1) { //tests if i is less than usernumber + 1
            d = 0; //sets d = 0
            while (d < i) { //tests if d is less than i
                n = 0; //sets n = 0
                while (n < userNumber - i) { //tests if n is less than usernumber minus i
                    System.out.print(" "); //prints a space
                    n++; //adds one to n
                }
                j = 0; //sets j = 0
                while (j < i) { //tests if j is less than i
                    System.out.print(i); //prints the value of i
                    j++; //adds one to j
                }
                k = 1; //sets k = 1
                while (k < j) { //tests if k is less than j
                    System.out.print(i); //prints the value of i
                    j--; //subtracts one from j
                }
                System.out.println(); //starts a new line
                d++; //adds one to d
            }
            n = 0; //sets n = 0
            while (n < userNumber - i) { //tests if n is less than usernumber minus i
                System.out.print(" "); //prints a space
                n++; //adds one to n
            }
            j = 0; //sets j = to 0
            while (j < i) { //tests if j is less than i
                System.out.print("-"); //prints a minus sign
                j++; //adds one to j
            }
            k = 1; //sets k = 1
            while (k < j) { //tests if k is less than j
                System.out.print("-"); //prints a minus sign
                j--; //subtracts one fomr j
            }
            System.out.println(); //starts a new line
            i++; //adds one to i
        }

        //tells user that it will print using do-while loops
        System.out.println("Using do-while loops");

        //nested do-while loops sand if statements that print the same example of code as above
        i = 1; //sets i = 1
        do {
            j = 0; //sets
            do {
                if (j != 0) { //tests if j does not equal 0
                    System.out.println(); //starts a new line
                }
                n = 0; //sets n = 0
                if (userNumber != 1 && i != userNumber) { //tests if the user number does not equal 1 and i does not equal the user number
                    do {
                        System.out.print(" "); //prints a space
                        n++; //adds one to n
                    } while (n < userNumber - i); //tests if n is less than the user number minus i
                }
                d = 0; //sets d = 0
                do {
                    System.out.print(i); //prints the value of i
                    d++; //adds one to d
                } while (d < i); //tests if d is less than i
                if (d != 1) { //tests if d does not equal 1
                    do {
                        System.out.print(i); //prints the value of i
                        d--; //subtracts one from d
                    } while (d > 1); //tests if d is greater than one
                }
                j++; //adds one to j
            } while (j < i); //tests if j is less than i
            System.out.println(); //starts a new line
            n = 0; //sets n = 0
            if (userNumber != 1 && i != userNumber) { //tests if usernumber is not equal to 1 and i does not equal i
                do {
                    System.out.print(" "); //prints a space
                    n++; //adds one to n
                } while (n < userNumber - i); //tests if n is less than usernumber minus i
            }
            d = 0; //sets d = 0
            do {
                System.out.print("-"); //prints a minus sign
                d++; //adds one to d
            } while (d < i); //tests if d is less than i
            if (d != 1) { //tests if d does not equal 1
                do {
                    System.out.print("-"); //prints a minus sign
                    d--; //subtracts one form d
                } while (d > 1); //tests if d is greater than o
            }
            System.out.println(); //starts a new line
            i++; //adds one to i
        } while (i < userNumber + 1); //tests if i is less than the usernmber plus 1

    }
}