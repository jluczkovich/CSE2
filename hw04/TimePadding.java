//John Luczkovich
//CSE2
//9/23/14
//
//hw04
//TimePadding
//
//this program takes user input of the total seconds of the time
//it then displays the time in hours minutes and seconds
//this is done by calculating the hours, minutes, and seconds individually

//import scanner
import java.util.Scanner;

//define class
public class TimePadding    {
    
    //define main method
    public static void main(String[] args)  {
        
        //declare scanner
        Scanner myScanner;
        
        //call scanner constructor
        myScanner = new Scanner(System.in);
        
        //prompt user to enter the number of seconds
        System.out.print("Enter the time in seconds: ");
        
        if (myScanner.hasNextInt()) {   //test if user enters an int
            int inputSeconds = myScanner.nextInt(); //store input as an int
            int hours = inputSeconds / 3600;    
            //store hours as an int calculated by the input seconds divided by 3600 and casted as an int
            int minutes = (inputSeconds - (hours * 3600)) / 60;
            //stores minutes as an int calculated by the input seconds, minus the product of hours and 3600, 
            //then divided by 60
            int seconds = (inputSeconds - (hours * 3600) - (minutes * 60));
            //stores seconds as an int calclated by the input seconds, minus the product of hours and 3600,
            //minus the product of minutes and 60
            
            if (minutes < 10)   {   //tests if minutes is less than 10
                if (seconds < 10)   {   //tests if seconds is less than 10
                    System.out.println("The time is " + hours + ":0" + minutes + ":0" + seconds);
                    //displays output with the minutes and seconds padded so it displays in the form
                    //  xx:0x:0x where the x's represent the corresponding values
                }
                else {
                    System.out.println("The time is " + hours + ":0" + minutes + ":" + seconds);
                    //displays output with the minutes and seconds padded so it displays in the form
                    //  xx:0x:xx where the x's represent the corresponding values
                }
            }
            else {
                if (seconds < 10)   {   //tests if seconds is less than 10
                    System.out.println("The time is " + hours + ":" + minutes + ":0" + seconds);
                    //displays output with the minutes and seconds padded so it displays in the form
                    //  xx:xx:0x where the x's represent the corresponding values
                }
                else {
                    System.out.println("The time is " + hours + ":" + minutes + ":" + seconds);
                    //displays output with the minutes and seconds padded so it displays in the form
                    //  xx:xx:xx where the x's represent the corresponding values
                }
            }
        }
        else {
            System.out.println("You did not enter an int"); //displayed if user does not enter an int
        }
    }
}