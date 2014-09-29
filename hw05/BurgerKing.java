//John Luczkovich
//CSE2
//9/27/14
//
//hw05
//BurgerKing
//
//This program ask a user if they want to order a burger, a soda, or fries
//For the burger option, the user is prompted if they want all the fixins,
//cheese, or nothing on the burger
//For the soda option, the user is prompted if they want pepsi, coke,
//sprite, or mountian dew
//For the fries option, the user is prompted if they want
//a large order or a small order

//import scanner
import java.util.Scanner;

//define class
public class BurgerKing {
    
    //define main method
    public static void main(String[] args)  {
        
        //declare scanner
        Scanner myScanner;
        
        //call scanner constructor
        myScanner = new Scanner(System.in);
        
        //prompt user if they want a burger (B or b),
        //soda (S or s), or fries (F or f)
        System.out.println("Enter a letter to indicate a choice of");
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.print("Fries (F or f)- ");
        
        //store user input as a string
        String userChoice = myScanner.next();
        
        //declare string variables
        String burgerOption, sodaOption, friesSize;
        
        //start switch statement for user input
        switch (userChoice) {
            case "B":   //test if user enters B for burger
                //Prompt user if they want "all the fixins" (A or a),
                //cheese (C or c), or none of the above (N or n)
                System.out.println("Enter A or a for \"all the fixins\"");
                System.out.println("    C or c for cheese");
                System.out.print("    N or n for none of the above- ");
                
                //store user input as a string
                burgerOption = myScanner.next();
                
                //switch statement for the option on the burger
                switch (burgerOption)   {
                    case "A":   //test if user enters A for all the fixins
                        System.out.println("You ordered a burger with \"all the fixins\"");
                        break;
                    case "a":   //test if user enters a for all the fixins
                        System.out.println("You ordered a burger with \"all the fixins\"");
                        break;
                    case "C":   //test if user enters C for cheese
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "c":   //test if user enters c for cheese
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "N":   //test if user enters N for nothing
                        System.out.println("You ordered a burger with nothing on it");
                        break;
                    case "n":   //test if user enters n for nothing
                        System.out.println("You ordered a burger with nothing on it");
                        break;
                    default:    //default option for if the user doesnt enter a valid option
                        System.out.println("You did not enter 'A', 'a', 'C', 'c', 'N', or 'n'");
                }
                return;
            case "b":   //test if user enters b for burger
                //Prompt user if they want "all the fixins" (A or a),
                //cheese (C or c), or none of the above (N or n)
                System.out.println("Enter A or a for \"all the fixins\"");
                System.out.println("    C or c for cheese");
                System.out.print("    N or n for none of the above- ");
                
                //store user input as a string
                burgerOption = myScanner.next();
                
                //switch statement for option on the burger
                switch (burgerOption)   {
                    case "A":   //test if user enters A for all the fixins
                        System.out.println("You ordered a burger with \"all the fixins\"");
                        break;
                    case "a":   //test if user enters a for all the fixins
                        System.out.println("You ordered a burger with \"all the fixins\"");
                        break;
                    case "C":   //test if user enters C for cheese
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "c":   //test if user enters c for cheese
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "N":   //test if user enters N for nothing
                        System.out.println("You ordered a burger with nothing on it");
                        break;
                    case "n":   //test if user enters n for nothing
                        System.out.println("You ordered a burger with nothing on it");
                        break;
                    default:    //default option for if the user doesnt enter a valid option
                        System.out.println("You did not enter 'A', 'a', 'C', 'c', 'N', or 'n'");
                }
                return;
            case "S":   //test if user enters S for soda
                //prompt user if they want pepsi (P or p), coke (C or c),
                //sprite (S or s), or mountian dew (M or m)
                System.out.println("Do you want Pepsi (P or p), Coke (C or c),");
                System.out.print("Sprite (S or s), or Mountian Dew (M or m)- ");
                
                //store user input as a string
                sodaOption = myScanner.next();
                
                //switch statement for type of soda
                switch (sodaOption) {
                    case "P":   //test if user enters P for pepsi
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "p":   //test if user enters p for pepsi
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "C":   //test if user enters C for coke
                        System.out.println("You ordered a Coke");
                        break;
                    case "c":   //test if user enters c for coke
                        System.out.println("You ordered a Coke");
                        break;
                    case "S":   //test if user enters S for sprite
                        System.out.println("You ordered a Sprite");
                        break;
                    case "s":   //test if user enters s for sprite
                        System.out.println("You ordered a Sprite");
                        break;
                    case "M":   //test if user enters M for mountian dew
                        System.out.println("You ordered a Mountian Dew");
                        break;
                    case "m":   //test if user enters m for mountian dew
                        System.out.println("You ordered a Mountian Dew");
                        break;
                    default:    //default option for if user doesnt enter a valid option
                        System.out.println("You did not enter 'P', 'p', 'C', 'c', 'S', 's', 'M', or 'm'");
                }
                return;
            case "s":   //test if user enters s for soda
                //prompt user if they want pepsi (P or p), coke (C or c),
                //sprite (S or s), or mountian dew (M or m)
                System.out.println("Do you want Pepsi (P or p), Coke (C or c),");
                System.out.print("Sprite (S or s), or Mountian Dew (M or m)- ");
                
                //store user input as a string
                sodaOption = myScanner.next();
                
                //switch statement for type of soda
                switch (sodaOption) {
                    case "P":   //test if user enters P for pepsi
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "p":   //test if user enters p for pepsi
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "C":   //test if user enters C for coke
                        System.out.println("You ordered a Coke");
                        break;
                    case "c":   //test if user enters c for coke
                        System.out.println("You ordered a Coke");
                        break;
                    case "S":   //test if user enters S for sprite
                        System.out.println("You ordered a Sprite");
                        break;
                    case "s":   //test if user enters s for sprite
                        System.out.println("You ordered a Sprite");
                        break;
                    case "M":   //test if user enters M for mountian dew
                        System.out.println("You ordered a Mountian Dew");
                        break;
                    case "m":   //test if user enters m for mountian dew
                        System.out.println("You ordered a Mountian Dew");
                        break;
                    default:    //default option if user doesnt enter a valid option
                        System.out.println("You did not enter 'P', 'p', 'C', 'c', 'S', 's', 'M', or 'm'");
                }
                return;
            case "F":   //test if user enters F for fries
                //promt user if they want a large or small order of fries
                System.out.println("Do you want a large (L or l) or");
                System.out.print("small (S or s) order of fries- ");
                
                friesSize = myScanner.next();
                
                //switch statement for size of fries
                switch (friesSize)  {
                    case "L":   //test if user enters L for large
                        System.out.println("You ordered a large order of fries");
                        break;
                    case "l":   //test if user enters l for large
                        System.out.println("You ordered a large order of fries");
                        break;
                    case "S":   //test if user enters S for small
                        System.out.println("You ordered a small order of fries");
                        break;
                    case "s":   //test if user enters s for small
                        System.out.println("You ordered a small order of fries");
                        break;
                    default:    //default option for if user doesnt enter a valid option
                        System.out.println("You did not enter 'L', 'l', 'S', or 's'");
                }
                return;
            case "f":   //test if user enters f for fries
                //promt user if they want a large or small order of fries
                System.out.println("Do you want a large (L or l) or");
                System.out.print("small (S or s) order of fries- ");
                
                friesSize = myScanner.next();
                
                //switch statement for size of fries
                switch (friesSize)  {
                    case "L":   //test if user enters L for large
                        System.out.println("You ordered a large order of fries");
                        break;
                    case "l":   //test if user enters l for large
                        System.out.println("You ordered a large order of fries");
                        break;
                    case "S":   //test if user enters S for small
                        System.out.println("You ordered a small order of fries");
                        break;
                    case "s":   //test if user enters s for small
                        System.out.println("You ordered a small order of fries");
                        break;
                    default:    //default option for if user doesnt enter valid option
                        System.out.println("You did not enter 'L', 'l', 'S', or 's'");
                }
                return;
            default:    //default option for if user doesnt enter a valid option
                System.out.println("You did not enter 'B', 'b', 'S', 's', 'F', or 'f'");
        }
    }
}