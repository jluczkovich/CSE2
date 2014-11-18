//John Luczkovich
//CSE2
//11/17/2014

//hw10
//FindDuplicates.java

//this program takes input from the user
//puts it into an array
//tests if there are any matching values
//and tests if there is exactly one pair


import java.util.Scanner;       //imports scanner
public class FindDuplicates {   //define class FindDuplicates
    public static void main(String[] arg) {     //define main method
        Scanner scan = new Scanner(System.in);  //construct scanner
        int num[] = new int[10];    //creates array of size 10
        String answer = "";     //define answer
        do {    //do while loop that runs until told otherwise
            System.out.print("Enter 10 ints- ");    //prompts user to enter 10 ints
            for (int j = 0; j < 10; j++) {      //for loop that gets a value from the user
                num[j] = scan.nextInt();
            }
            String out = "The array ";  //adds to out string
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) {     //calls method to test for duplicate
                out += "has ";      //adds has to out
            }
            else {      //if if returns false runs
                out += "does not have ";    //adds does not have to out
            }
            out += "duplicates.";   //adds duplicates to out
            System.out.println(out);    //prints out
            out = "The array ";     //sets out equal to The array
            out += listArray(num);  //adds the output from the method listArray to out
            if (exactlyOneDup(num)) {   //if statement that runs if method exactlyOneDup retruns true
                out += "has ";      //adds has to out
            }
            else {  //runs if exactlyOneDup returns false
                out += "does not have ";    //adds does not have to out
            }
            out += "exactly one duplicate.";    //adds exactly one duplicate to out
            System.out.println(out);    //prints out
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");    //prompts the user if the want to go agian
            answer = scan.next();   //gets input from scanner
        } while (answer.equals("Y") || answer.equals("y"));     //tests if users input is Y or y
    }

    public static String listArray(int num[]) {     //declare method listArray
        String out = "{";   //adds { to string out
        for (int j = 0; j < num.length; j++) {  //for loop that puts the numbers inputed by to user into the form {1, 2, 3} 
            if (j > 0) {    //tests if j is greater than 0
                out += ", ";    //adds a comma
            }
            out += num[j];  //adds the number from array num at place j
        }
        out += "} ";    //adds } to out
        return out;     //returns out from the method
    }
    
    public static Boolean hasDups(int[] array){     //declare method hasDups
        for (int i = 0; i < array.length; i++) {    //nested for loops that tests if there is a duplicate
            for (int j = i + 1; j < array.length; j++) {    
                if (array[i] == array[j]) {     //tests for a match
                    return true;    //returns true if there is a match in the array
                }
            } 
        }  
        return false;   //returns false if there is no match
    }
    
    public static Boolean exactlyOneDup(int[] array){   //declare method exactlyOneDup
        int dups = 0;   //declare and set dups equal to one
        for (int i = 0; i < array.length; i++) {    //nested for loops for testing if there is exactly one duplicate
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {     //tests if there is a duplicate
                    dups += 1;      //adds one to duplicate if there is a duplicate
                }
            }
        }
        if (dups == 1) {    //tests if dups equals one
            return true;    //returns true from the method
        }
        else {      //runs if if statement returns false
            return false;   //returns false from method
        }
    }
}
