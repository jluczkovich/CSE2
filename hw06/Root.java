//John Luczkovich
//CSE2
//10/12/14
//
//hw06
//Root
//
//this program prompts a user to enter a double and then takes the square root of that numebr
//the square root is calculated by using the bisection method
//the bisection method works by first assigning the value of 0 to the low value and
//the user number + 1 to the high value
//if the middle number squared is great than the user number, then the high and middle values are swapped
//if the middle number squared is less than the user number, then the low and middle values are swapped
//this process is repeated until the values are within a tolerance of one another
//the calculated value is then displayed to the user

//import scanner
import java.util.Scanner;

//define class
public class Root   {
    
    //define main method
    public static void main(String[] arg)   {
        
        //declare scanner
        Scanner scan;
        
        //call scanner constructor
        scan = new Scanner(System.in);
        
        //prompt user to enter a double greater than 0
        System.out.print("Enter a double greater than 0 and I print the square root- ");
        
        //declare variable for user number and assign preliminary value
        double userNumber = 0;
        
        if (scan.hasNextDouble())   {           //test if user enters a double
            userNumber = scan.nextDouble();     //store user input
            if (userNumber < 0) {               //test if user number is > 0
                System.out.println("You did not enter a number > 0");   //tell user they did not enter a number
                return;                                                 //> 0 and end the program
            }
        }
        else    {   //run if user does not enter a double
            System.out.println("You did not enter a double");   //tells user they did not enter a double
            return;                                             //ends program
        }
        
        //declare and assign values to variables
        double low = 0;                 //low value
        double high = userNumber + 1;   //high value
        double middle = 0;              //middle value
        double tolerance = 0.0000001 * (userNumber + 1);    //tolerance and its calculation
        double x;                       //variable for switching values
        
        while (high - low > tolerance) {    //loop that runs if the difference of the high and low value is > tolerance
            middle = (low + high) / 2;      //assigns a value to middle by averaging the high and low
            
            if (middle * middle > userNumber)   {   //tests if user number is less than the middle val^2
                x = high;           //these three lines of code
                high = middle;      //swap the high and the middle values
                middle = x;         //for one another
            }
            else {              //alternate that runs if the user number is greater than the middle val^2
                x = low;        //these three lines of code
                low = middle;   //swap the low and middle values
                middle = x;     //for one another
            }
        }
        
        //output of the square root of the number to the user
        System.out.println("The square root of " + userNumber + " is " + middle);
    }
}