//John Luczkovich
//CSE2
//9/11/14
//
//lab02
//
//This program takes input data from the user (number of Big Macs,
//cost per BigMac, and sales tax)v and uses it to calculate a total 
//cost for a McDonalds BigMac purchase

//import scanner for user input data
import java.util.Scanner;

//define class
public class BigMac {
    
    //define main method
    public static void main(String[] args)  {
        
        //define scanner
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
        //output to user
        System.out.print("Enter the number of BigMacs (an integer > 0): ");
        int nBigMacs = myScanner.nextInt();
        //above line takes users input for the number of BigMacs purchased 
        //and stores it as an int value
        
        //output to user
        System.out.print("Enter the cost per BigMac as a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();
        //above line takes user input for cost per BigMac and stores is as a double value
        
        //output ot user
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        //above line takes user input for the sales tax and stors it as a double value
        
        taxRate/=100;   //user enters percent, but I want proportion
        
        //define variables
        double cost$;   //cost of BigMacs
        int dollars,    //whole dollar amount of cost
                dimes, pennies; //for storing digits
                    //to the right of the decimal point
                    //for the cost$
        cost$ = nBigMacs * bigMac$ * (1 + taxRate);
        //get whole amount, dropping decimal fraction
        dollars = (int) cost$;
        //get dimes amoun, e.g.,
        //  (int) (6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:     583%100 -> 83, 27%5 -> 2
        dimes = (int) (cost$ * 10) %10;
        pennies = (int) (cost$ * 100) %10;
        
        //output to user displaying the number purchased, the price per, sales tax,
        //and the total cost
        System.out.println("The total cost of " + nBigMacs + " BigMacs, at $" + bigMac$ + 
        " per BigMac, with a sales tax of " + (int) (taxRate * 100) + "%, is $" + dollars +
        '.' + dimes + pennies);
        
    }
}