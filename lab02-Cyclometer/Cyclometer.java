//John Luczkovich  
//9/4/2014 
//CSE2-110
//
//Bicycle Cyclometer Program
//  print the number of minutes for each trip
//  print the number of counts for each trip
//  print the distance of each trip in miles
//  print the distance for the two trips combined

//Define a class
public class Cyclometer {
    
    //Define main method
    public static void main(String[] args) {
        
        //input data and variables
        int secsTrip1=480;      //number of seconds Trip 1 took as integer
        int secsTrip2=3220;     //number of seconds Trip 2 took as integer
        int countsTrip1=1561;   //number of counts for Trip 1 as integer
        int countsTrip2=9037;   //number of counts for Trip 2 as integer
        
        //intermediate variables and output data
        double wheelDiameter=27.0,  //define the diameter of the wheel 
        PI=3.14159,                 //define the value of PI
        feetPerMile=5280,           //conversion of 1 mile to feet
        inchesPerFoot=12,           //conversion of 1 foot to inches
        secondsPerMinute=60;        //conversion of 1 minute to seconds
        double distanceTrip1, distanceTrip2, totalDistance;
        //Above define variables for the distance of trip 1,
        //the distance of trip 2, and total distance of trip 1
        //and 2 combined as floating-point numbers
        
        //Print out length of each trip 1 and trip 2 in minutes
        //along with the number of counts
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
            
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile;   //Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //Print out the output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    
    }
}