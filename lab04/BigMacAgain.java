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
        int nBigMacs = myScanner.nextInt();
        
        if (myScanner.hasNextInt()){
        }
        else{
            System.out.println("You did not enter an int");
            return;     //leaves the program, i.e.
                            //the program terminates
        }
        
        if (nBigMacs > 0) {
            System.out.println("You ordered " + nBigMacs + " Big Macs for a cost of " 
            + nBigMacs + "x2.22 = $" + nBigMacs * 2.22);
        }
        else{
            System.out.print("You did not enter an int > 0");
            return;     //program terminates
        }
        
        System.out.print("Do you want an order of fries (Y/y/N/n)?");
        String answer = myScanner.next();
        
        if (answer.equals("Y")){
            System.out.print("You ordered fries at a cost of $2.15");
            System.out.print("The total cost of the meal is $" + nBigMacs * 2.22 + 2.15);
        }
        else if (answer.equals("y")){
            System.out.print("You ordered fries at a cost of $2.15");
            System.out.print("The total cost of the meal is $" + nBigMacs * 2.22 + 2.15);
        }
        else if (answer.equals("N")){
            System.out.print("The total cost of the meal is $" + nBigMacs * 2.22);
        }
        else if (answer.equals("n")){
            System.out.print("The total cost of the meal is $" + nBigMacs * 2.22);
        }
        else {
            System.out.print("You did not enter 'y', 'Y', 'n', 'N'");
            return;
        }
    }
}