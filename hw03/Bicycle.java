//John Luczkovich
//CSE2
//9/14/14
//
//hw03
//Bicycle
//
//This program takes user input of seconds and counts
//and uses this information to calculate the distance travelled,
//the time it took to travel the distance, and the average
//miles per hour travelled
//

//Import scanner
import java.util.Scanner;

//Define class
public class Bicycle {
    
    //Define main method
    public static void main(String[] args)  {
        
        //Declare scanner
        Scanner myScanner;
        
        //Call scanner constructor
        myScanner = new Scanner (System.in);
        
        //output to user for variable value definement
        System.out.print("Enter number of seconds: ");
        int nSeconds = myScanner.nextInt();     //store user input for seconds as an integer
        System.out.print("Enter number of counts: ");
        int nCounts = myScanner.nextInt();      //store user input for counts as an integer
        
        //declare and define variables
        double wheelDiameter = 27.0,    //define diameter of the wheel
        PI = 3.14159,                   //define PI
        feetPerMile = 5280,             //conversion of feet to miles
        inchesPerFoot = 12,             //conversion of inches to feet 
        secondsPerMinute = 60;          //convert seconds to minutes
        
        //calculations
        double tripDistance = (nCounts * wheelDiameter * PI) / (inchesPerFoot * feetPerMile);
        //calculate the distance of the trip by taking the number of counts multiplying it by the
        //wheel diameter and PI, then dividing by inches per foot and feet per mile
        double nMinutes = nSeconds / secondsPerMinute;
        //calculate the number of minutes by dividing seconds by the number of seconds per minute 
        
        //output to user
        System.out.printf("The distance was %3.2f", tripDistance);      //trip distance to two decimals
        System.out.println(" miles and took " + nMinutes + " minutes.");
        System.out.printf("The average mph was %4.2f %n", (tripDistance / (nMinutes / 60)));
        //mph to two decimals
        
    }
}