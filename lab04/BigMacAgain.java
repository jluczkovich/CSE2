//John Luczkovich
//CSE2
//9/18/14
//
//BigMacAgain
//
//

//import scanner
import java.util.Scanner;

//define class
public class BigMacAgain {
    
    //define main method
    public static void main(String[] args) {
        
        //declare scanner
        Scanner myScanner;
        
        //call scanner constructor
        myScanner = new Scanner(System.in);
        
        //ask user for the number of Big Macs
        System.out.print("Enter number of Big Macs: ");
        
        if (myScanner.hasNextInt()){
             int nBigMacs = myScanner.nextInt();
            if (nBigMacs > 0) {
            System.out.printf("You ordered " + nBigMacs + " Big Macs for a cost of " 
            + nBigMacs + "x2.22 = $%4.2f %n", (nBigMacs * 2.22));
        }
        
        System.out.print("Do you want an order of fries (Y/y/N/n)?");
        String answer = myScanner.next();
        
        if (answer.equals("Y")){
            System.out.println("You ordered fries at a cost of $2.15");
            System.out.printf("The total cost of the meal is $%4.2f %n", (nBigMacs * 2.22 + 2.15));
        }
        else if (answer.equals("y")){
            System.out.println("You ordered fries at a cost of $2.15");
            System.out.printf("The total cost of the meal is $%4.2f %n", (nBigMacs * 2.22 + 2.15));
        }
        else if (answer.equals("N")){
            System.out.printf("The total cost of the meal is $%4.2f %n", (nBigMacs * 2.22));
        }
        else if (answer.equals("n")){
            System.out.printf("The total cost of the meal is $%4.2f %n", (nBigMacs * 2.22));
        }
        else {
            System.out.println("You did not enter 'y', 'Y', 'n', 'N'");
            return;
        }
        }
        else{
            System.out.println("You did not enter an int > 0");
            return;     //program terminates
        }
    }
}