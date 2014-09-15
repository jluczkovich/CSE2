//John Luczkovich
//CSE2
//9/14/14
//
//This program calculates the four digits after a decimal point
//It takes user input and performs several calculations to
//derive this answer


//Import scanner
import java.util.Scanner;

//define class
public class FourDigits {
    
    //define main method
    public static void main(String[] args) {
        
        //declare scanner
        Scanner myScanner;
        
        //call scanner construction
        myScanner = new Scanner (System.in);
        
        //prompt user to enter a double
        System.out.print("Enter a double and I display the" +
        " four digits to the right of the decimal point: ");
        double userNumber = myScanner.nextDouble(); 
        //store user input as double
        
        
        int decimalPoints = (int) (userNumber * 10000 - ((int)userNumber * 10000.0));   
        //get the four decimal points
        int firstDigit = (int) (decimalPoints / 1000);  
        //get the first digit after the decimal point
        int secondDigit = (int) ((decimalPoints / 100) - (((int) (decimalPoints / 1000)) * 10));
        //get the second digit after the decimal point
        int thirdDigit = (int) (decimalPoints / 10) - (((int) (decimalPoints / 100) * 10));
        //get the third digit after the deciaml point
        int fourthDigit = (int) (decimalPoints) - (((int) (decimalPoints / 10 ) * 10));
        //get the fourth digit after the decimal point
        
        //print out the four digits
        System.out.println("The four digits are " + firstDigit + secondDigit + thirdDigit + fourthDigit);
        
    }
}