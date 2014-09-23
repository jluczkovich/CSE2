//John Luczkovich
//CSE2
//9/22/14
//
//hw04
//Month
//
//this program takes input from the user and displays
//the number of days in that month
//it takes the user input and sees if it equals a int
//between 1 and 12
//if the int is 2, then the user is asked for the year of the month
//it is then determined if the year is a leap year
//and displays the number of days accordingly

//import scanner
import java.util.Scanner;

//declare class
public class Month  {
    
    //declare main method
    public static void main(String[] args)  {
        
        //declare scanner
        Scanner myScanner;
        
        //call scanner constructor
        myScanner = new Scanner(System.in);
        
        //prompt user to enter an int for the month
        System.out.print("Enter an int giving the number of the month (1-12) ");
        
        if (myScanner.hasNextInt()) {
            int monthNumber = myScanner.nextInt();  //store input as an int
            if (monthNumber == 1)   {   //test int to see if it = 1 
                System.out.println("The month has 31 days");    //output for January
            }
            else if (monthNumber == 2)  {   //test int to see if it = 2
                System.out.print("Enter an int giving the year ");   //prompt user to enter year
                if (myScanner.hasNextInt()) {
                    int year = myScanner.nextInt(); //store year as an int
                    if ((year % 4) == 0)    {           //this formula calculates if the year is a leap year
                        if ((year % 100) == 0)  {       //divide the year by 4, if no remainder, divide by 100,
                            if ((year % 400) == 0)   {  //if no remainder, divide by 400, if no remainder year
                                                        //is leap year
                                System.out.println("The month has 29 days");    //output for Febuary leap year
                            }
                            else {
                                System.out.println("The month has 28 days");    //output for Febuary nonleap year
                            }
                        }
                        else {
                            System.out.println("The month has 28 days");    //output for Febuary nonleap year
                        }
                    }
                    else {
                        System.out.println("The month has 28 days");    //output for Febuary nonleap year
                    }
                }
            }
            else if (monthNumber == 3)  {   //test if int equals 3
                System.out.println("The month has 31 days");    //output for March
            }
            else if (monthNumber == 4)  {   //test if int equals 4
                System.out.println("The month has 30 days");    //output for April
            }
            else if (monthNumber == 5)  {   //test if int equals 5
                System.out.println("The month has 31 days");    //output for May
            }
            else if (monthNumber == 6)  {   //test if int equals 6
                System.out.println("The month has 30 days");    //output for June
            }
            else if (monthNumber == 7)  {   //test if int equals 7
                System.out.println("The month has 31 days");    //output for July
            }
            else if (monthNumber == 8)  {   //test if int equals 8
                System.out.println("The month has 31 days");    //output for August
            }
            else if (monthNumber == 9)  {   //test if int equals 9
                System.out.println("The month has 30 days");    //output for September
            }
            else if (monthNumber == 10)  {  //test if int equals 10
                System.out.println("The month has 31 days");    //output for October
            }
            else if (monthNumber == 11)  {  //test if int equals 11
                System.out.println("The month has 30 days");    //output for November
            }
            else if (monthNumber == 12)  {  //test if int equals 12
                System.out.println("The month has 31 days");    //output for December
            }
            else {
                System.out.println("You did not enter an int between 1 and 12");
                //output if user does not enter a int between 1 and 12
            }
        }
        else {
            System.out.println("You did not enter an int");
            //output if user does not enter a int
        }
    }
}