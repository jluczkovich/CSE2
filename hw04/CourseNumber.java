//John Luczkovich
//CSE2
//9//22/14
//
//hw04
//CourseNumber
//
//this program takes a six digit user input of a course number 
//and outputs the semester and the year
//it does this by taking the course number, dividing it by 100 to get the year,
//then takes the course number and uses remainder division to find the semester number

//import scanner
import java.util.Scanner;

//declare class
public class CourseNumber {
    
    //declare main method
    public static void main(String[] args)  {
        
        //declare scanner
        Scanner myScanner;
        
        //call scanner constructor
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter a six digit number giving the course semester- ");  //prompt user to enter coursenumber
        
        if (myScanner.hasNextInt()) {   //check if user enters an int
            int courseNum = myScanner.nextInt();    //store course number as int
            int yearOffered = courseNum / 100;      //find year by dividing coursenumber by 100 and casting as an int
            int semesterNumber = courseNum % 100;   //find semester number by using remainder division
            
            if (courseNum >= 186510 && courseNum <= 201440) {   //check to make sure course number falls within range
                if (semesterNumber == 10) { //test if the semester number = 10
                    System.out.println("The course was offered in the Spring semester of " + yearOffered);
                    //display spring semester and year
                }
                else if (semesterNumber == 20)  {   //test if semester number = 20
                    System.out.println("The course was offered in the Summer 1 semester of " + yearOffered);
                    //display summer 1 and year
                }
                else if (semesterNumber == 30)  {   //test if semester number = 30
                    System.out.println("The course was offered in the Summer 2 semester of " + yearOffered);
                    //display summer 2 and year
                }
                else if (semesterNumber == 40)  {   //test if semester number = 40
                    System.out.println("The course was offered in the Fall semester of " + yearOffered);
                    //display fall and year
                }
                else {
                    System.out.println(semesterNumber + " is not a legitimate semester");
                    //output if semester number is not legitimate
                }
            }
            else {
                System.out.println("The number was outside the range [186510,201440]");
                //output if course number does not fit within range
            }
        }
        else {
            System.out.println("You did not enter an int");
            //output if user does not enter an int
        }
    }
}