//John Luczkovich
//CSE2
//9/22/14
//
//homework 4
//program 1
//IncomeTax
//
//this program calculates the income tax from user input
//when the user inputs a value less than 20 the program calculates the income tax at 5%
//when the user inputs a value less than 40 the program calculates the income tax at 7%
//when the user inputs a value less than 78 the program calculates the income tax at 12%
//when the user inputs a value greater than or equal to 78 the program calculates the income tax at 14%
//the income tax is then displayed to the user

//import scanner
import java.util.Scanner;

//define class
public class IncomeTax  {
    
    //define main method
    public static void main(String[] args)  {
        
        //declare scanner
        Scanner myScanner;
        
        //call scanner construction
        myScanner = new Scanner (System.in);
        
        //prompt user to enter an int for the thousands of dollars on income
        System.out.print("Enter an int giving the number of thousands- ");
        
        if (myScanner.hasNextInt()) {
            int income = myScanner.nextInt();   //store inout as an int
            if (income > 0) {   //test if number is greater than 0
                
                if (income < 20)    {   //test if number is less than 20
                    double fivePercentTax = ((double) income) * 1000.0 * 0.05;
                    //declare variable for 5% tax and calculate the 5% tax
                    System.out.print("The tax rate on $" + income + ",000 is 5.0%, and the tax is ");
                    System.out.printf("$%4.2f %n", fivePercentTax);
                    //print out output to user
                }
                else if (income < 40)   {   //test if number is less than 40
                    double sevenPercentTax = ((double) income) * 1000.0 * 0.07;
                    //declare variable for 7% tax and calculate the 7% tax
                    System.out.print("The tax rate on $" + income + ",000 is 7.0%, and the tax is ");
                    System.out.printf("$%4.2f %n", sevenPercentTax);
                    //print out output to user
                }
                else if (income < 78)   {   //test if number is less than 78
                    double twelvePercentTax = ((double) income) * 1000.0 * 0.12;
                    //declare variable for 12% tax and calculate the 12% tax
                    System.out.print("The tax rate on $" + income + ",000 is 12.0%, and the tax is ");
                    System.out.printf("$%4.2f %n", twelvePercentTax);
                    //print out output to user
                }
                else if (income >= 78)  {   //test if number is greater than or equal to 78
                    double fourteenPercentTax = ((double) income) * 1000.0 * 0.14;
                    //declare variable for 14% tax and calculate the %14 tax
                    System.out.print("The tax rate on $" + income + ",000 is 14.0%, and the tax is ");
                    System.out.printf("$%4.2f %n", fourteenPercentTax);
                    //print out output to user
                }
            }
            else {
                System.out.println("You did not input a positive int");
                //output if user does not enter a positive int
            }
        }
        else {
            System.out.println("You did not enter an int");
            //output if user does not enter an int
        }
    }
}