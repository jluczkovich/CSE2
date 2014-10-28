//John Luczkovich
//CSE2
//10/23/14
//
//hw08
//HW8.java
//
//this program displays the use of methods and overloaded methods
//it uses a method called getInput to acquire input from the user from a chosen string
//the first call of the method tests for the user to enter C or c 
//it calls the method with the use of the parameters of a scanner and a sting
//this method then calls the version of the method that has the parameters of a scanner, a string, and
//an int for the number of times to run, so we use a high int for the value
//the second call of the method tests if the user enters y, Y, n, or N within 5 tries
//it calls the method with the use of the parameters of a scanner, a string, and an int for the number of runs
//the third call of the method tests if the user enters 1, 2, 3, 4, 5, 6, 7, 8, or 9
//it calls the method with the parameters of a scanner and two strings



//import scanner class
import java.util.Scanner;

//define class
public class HW8 {

    //define getInput method for parameters of a scanner, a string and a int 
    public static char getInput(Scanner scan, String a, int runs) {
        
        //declare and assign values 
        int length = a.length();    //get the length of the string
        int i = 0;                  //set i equal to 0
        int tries = runs;           //set tries equal to runs
        
        while (runs > 0) {  //test if the value of runs is less than 0
            runs--;         //subtract one from runs
            String s = scan.next(); //get input from the user and store it as a string
            if (s.length() > 1) {   //test if the lenght of the user input is greater than one character
                System.out.print("You should enter exactly one character- ");   //prompts the user to try again
                continue;   //breaks one iteration of the loop
            } 
            
            //this next loop gets the chars at each spot of the inout string
            for (i = 0; i < length; i++) {  //sets i equal to 0, tests if i is less than the length, adds one to i after one run of the loop
                char b = a.charAt(i);   //stores the char at the i position as variable b 
                if (b == (s.charAt(0))) {   //tests if the users input is the same as the the char b
                    return b;   //if the above is true the method will return the char stored to variable b
                }
            }
            //prompts the user to enter a new character if theirs did not match one from the list
            System.out.print("You did not enter a character from the list '" + a + "'; try again- "); 
        }
        
        //the next three lines run if the user fails to enter an acceptable character within a certian number of attempts
        System.out.println();   //starts a new line
        System.out.println("You failed after " + tries + " tries"); //tells the user they failed within a number of tries
        return ' '; //returns a space from the method
    }

    //defines the method getInput for the parameters of a scanner and a string
    public static char getInput(Scanner scan, String a) {
        return getInput(scan, a, 100000);   //runs the method for scanner, a string, and an int count
    }

    //define the method getInput for the parameter of a scanner then 2 strings
    public static char getInput(Scanner scan, String a, String b) {

        //find the length of string b and store it to the variable length
        int length = b.length();

        //do while loop that acquires inout from the user and tests if it is valid input
        do {
            
            System.out.println(a);  //print out string a

            System.out.print("Enter one of: "); //print out to the user
            
            int letterNum = 0;  //set the variable letterNum to 0

            //while loop that gets the print out statement to the user
            while (length > letterNum) {    //tests if the length is greater than the letterNum
                System.out.print("'" + b.charAt(letterNum) + "'");  //prints the char at some point in the string
                
                letterNum++;    //adds one to the letterNum
                
                if (letterNum != length) {  //tests if the letterNum does not equal the length
                    System.out.print(", "); //prints a coma and a space to seperate the chars being printed
                }
                else {  //runs if the if statement returns false
                    System.out.print("- "); //prints a dash and a space
                }
            }
            
            String r = scan.next(); //stores the user's input as String r
            
            if (r.length() > 1) {   //tests if the string is greater than a length of 1
                System.out.println("Enter exactly one character");  //prompts the user
                continue;   //breaks one iteration of the loop
            }
            //sets letterNum to 0
            letterNum = 0;
            
            //loop that tests if the user's input is equal to a character from string b
            while (length > letterNum) {    //tests if the length is greater than the letterNum
                char c = b.charAt(letterNum);   //gets the char at point letterNum in the string
                if (c == (r.charAt(0))) {   //tests if the user's input equals a character in the string 
                    return c;   //outputs c
                }
                letterNum++; //adds one to the letterNum
            }
            
            
            System.out.println("You did not enter an acceptable character");    //tells the user their input was not valid
        
        } while (true); //runs the loop again
    }

    //define main method
    public static void main(String[] arg) {

        //declare variable
        char input;

        //declare and call scanner constructor
        Scanner scan = new Scanner(System.in);

        //prompt user to enter C or c to contintue if not the program terminates
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");

        //store user input and get that input through the use of the getInput method
        input = getInput(scan, "Cc");

        //displays the users input
        System.out.println("You entered '" + input + "'");

        //prompt the user to enter an y, Y, n, or N
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");

        //store the user's input and get that input through the use of the getInput method
        input = getInput(scan, "yYnN", 5); //give up after 5 attempts

        //test if the input does not equal " "
        if (input != ' ') {
            System.out.println("You entered '" + input + "'"); //print out the user's input
        }

        //store the user's input and get that input through thr use of the getInput method
        input = getInput(scan, "Choose a digit.", "0123456789");

        //print out the user's input
        System.out.println("You entered '" + input + "'");
    }
}
