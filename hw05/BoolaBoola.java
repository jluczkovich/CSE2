//John Luczkovich
//CSE2
//9/27/19
//
//hw05
//BoolaBoola
//
//this program tests the users knowledge of boolean values and operators
//it assigns a random value of 0 or 1 to variables and uses those values
//to assign a boolean value of true or false or an opperator,
//those being or, ||, or and, &&
//it then prompts the user to enter what they think the value
//of the expression should be and displays if their answer is correct or not

//import scanner
import java.util.Scanner;

//define class
public class BoolaBoola {
    
    //define main method
    public static void main(String[] args)  {
        
        //declare scanner
        Scanner myScanner;
        
        //call scanner constructor
        myScanner = new Scanner(System.in);
        
        //declare variables with 1 or 0 value for boolean values
        int firstBoolean = (int) (Math.random() * 2);
        int secondBoolean = (int) (Math.random() * 2);
        int thirdBoolean = (int) (Math.random() * 2);
        
        //declare variables with 1 or 0 value for operator
        int firstOperator = (int) (Math.random() * 2);
        int secondOperator = (int) (Math.random() * 2);
        
        //declare variables
        boolean outputBooleanOne, outputBooleanTwo, outputBooleanThree, booleanAnswer;
        String outputOperatorOne, outputOperatorTwo;
        
        //assigns a boolean value of true or false to the first output boolean variable
        //based on if its value is 0 for false or 1 for true, the latter being defined
        //as the default condition
        switch (firstBoolean)   {
            case 0:
                outputBooleanOne = false;
                break;
            default:
                outputBooleanOne = true;
        }
        //assigns a boolean value of true or false to the second output boolean variable
        //based on if its value is 0 for false or 1 for true, the latter being defined
        //as the default condition
        switch (secondBoolean) {
            case 0:
                outputBooleanTwo = false;
                break;
            default:
                outputBooleanTwo = true;
        }
        //assigns a boolean value of true or false to the third output boolean variable
        //based on if its value is 0 for false or 1 for true, the latter being defined
        //as the default condition
        switch (thirdBoolean)   {
            case 0:
                outputBooleanThree = false;
                break;
            default:
                outputBooleanThree = true;
        }
        //assigns the opperator based on if the value for the first opperator is
        //0 for or, ||, or 1 for and, &&, the latter being the default
        switch (firstOperator)  {
            case 0:
                outputOperatorOne = "||";
                break;
            default:
                outputOperatorOne = "&&";
        }
        //assigns the opperator based on if the value for the first opperator is
        //0 for or, ||, or 1 for and, &&, the latter being the default
        switch (secondOperator) {
            case 0:
                outputOperatorTwo = "||";
                break;
            default:
                outputOperatorTwo = "&&";
        }
        
        //calculates the final answer for the combination of boolean values and opperators
        //stores answer
        switch (outputOperatorOne)  {
            case "||":  //tests if first opperator is an or, ||
                switch (outputOperatorTwo)  {
                    case "||":  //tests if second operator is an or, ||
                        booleanAnswer = outputBooleanOne || outputBooleanTwo || outputBooleanThree;
                        break;
                    default:    //and, &&, is set as the default
                        booleanAnswer = outputBooleanOne || outputBooleanTwo && outputBooleanThree;
                }
                break;
            default:    //and, &&, is set as the default
                switch (outputOperatorTwo)  {
                    case "||":  //tests if second operator is an or, ||
                        booleanAnswer = outputBooleanOne && outputBooleanTwo || outputBooleanThree;
                        break;
                    default:    //and, &&, is set as the default
                        booleanAnswer = outputBooleanOne && outputBooleanTwo && outputBooleanThree;
                }
        }
        
        //prints the boolean and operator to the user and prompts the user to enter T or t for true
        //or F or f for false
        System.out.print("Does " + outputBooleanOne + " " + outputOperatorOne + " " + outputBooleanTwo + 
        " " + outputOperatorTwo + " " + outputBooleanThree + " have the value true (T or t) or false (F or f)- ");
        
        //stores users answer as a string
        String userAnswer = myScanner.next();
        
        //tests to see if users answer is correct and dispays the result of their answer
        //being correct or not
        if ((userAnswer.equals("T") || userAnswer.equals("t")) && booleanAnswer == true)    {
            System.out.println("Correct");
            return; //terminates program
        }
        if ((userAnswer.equals("T") || userAnswer.equals("t")) && booleanAnswer == false)   {
            System.out.println("Wrong; try again");
            return; //terminates program
        }
        if ((userAnswer.equals("F") || userAnswer.equals("f")) && booleanAnswer == false)   {
            System.out.println("Correct");
            return; //terminates program
        }
        if ((userAnswer.equals("F") || userAnswer.equals("f")) && booleanAnswer == true)    {
            System.out.println("Wrong; try again");
            return; //terminates program
        }
        
        System.out.println("Invalid answer");   //output if user enters an invalid answer
    }
}