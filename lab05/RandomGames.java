//John Luczkovich
//CSE2
//9/25/14
//
//lab05
//RandomGames
//

//import scanner
import java.util.Scanner;

//define class
public class RandomGames    {
    
    //define main method
    public static void main(String[] args)  {
        
        //declare scanner
        Scanner myScanner;
        
        //call scanner constructor
        myScanner = new Scanner(System.in);
        
        //prompt user for what game to play
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card-");
        String gameLetter = myScanner.next();
        int rouletteNumber = (int) (Math.random() * 37);
        int length = gameLetter.length();
        
        switch (length) {
            case 1: switch (gameLetter) {
                case "R": 
                    switch (rouletteNumber) {
                        case 37: System.out.println("Roulette: 00");
                        break;
                        default: System.out.println("Roulette: " + rouletteNumber);
                        return;
                    }
                case "r": 
                switch (rouletteNumber) {
                        case 37: System.out.println("Roulette: 00");
                        break;
                        default: System.out.println("Roulette: " + rouletteNumber);
                        return;
                    }
                break;
                case "C": System.out.println("Option has not been implemented");
                break;
                case "c": System.out.println("Option has not been implemented");
                break;                
                case "P": System.out.println("Option has not been implemented");
                break;
                case "p": System.out.println("Option has not been implemented");
                break;                
                default: System.out.println("'" + gameLetter + "' is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
                break;
            }
            break;
            default: System.out.println("A single character expected");
        }
    }
}