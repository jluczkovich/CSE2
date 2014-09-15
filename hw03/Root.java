///John Luczkovich
//CSE2
//9/14/14
//
//This program approximates the cube of a user input
//value. 




//import scanner
import java.util.Scanner;

//define class
public class Root   {
    
    //define main method
    public static void main(String[] args)  {
        
        //declare scanner
        Scanner myScanner;
        
        //call scanner construction
        myScanner = new Scanner (System.in);
        
        //print out prompt for user to enter a double
        System.out.println("Enter a double, and I print its cube root: ");
        double userNumber = myScanner.nextDouble(); //store user input as a double
        
        double guess = userNumber / 3;  //divide user number by 3
        guess = ((2 * guess * guess * guess + userNumber) / (3 * guess * guess));
        guess = ((2 * guess * guess * guess + userNumber) / (3 * guess * guess));
        guess = ((2 * guess * guess * guess + userNumber) / (3 * guess * guess));
        guess = ((2 * guess * guess * guess + userNumber) / (3 * guess * guess));
        guess = ((2 * guess * guess * guess + userNumber) / (3 * guess * guess));
        //above four lines take the value of the guess, cube it, multiply it by 2,
        //add the original user number, divide it by 3, and divide it by the 
        //the guess value squared. For each line, substition is performed.
        
        //output to user of the approximate cube root of the user number and the approximate 
        //number cubed
        System.out.println("The cube root is " + guess + " : " + guess + " * " + guess); 
        System.out.println(" * " + guess + " = " + (guess * guess * guess));
        
    }
}