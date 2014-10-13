import java.util.Scanner;

public class LoopTheLoop    {
    
    public static void main(String[] args)  {
        
        Scanner scan;
        
        scan = new Scanner(System.in);
        
        while (true)    {
            
            System.out.print("Enter an int in the range of 1 to 15 - ");
        
            int nStars = 0;
        
            if (!scan.hasNextInt())  {
                System.out.println("Your int was not in range of [1,15]");
                return;
            }
        
            nStars = scan.nextInt();
            int control2 = nStars;
        
            if (nStars < 1 || nStars > 15)  {
                System.out.println("Your int was not in range of [1,15]");
                return;
                }
            while (nStars > 0)  {
                System.out.print("*");
                nStars--;
            }
        
            System.out.println(" ");
        
            int control = 0;
        
            while (control < control2)  {
                control++;
                while (nStars < control)  {
                    System.out.print("*");
                    nStars++;
                }
                System.out.println(" ");
                nStars = 0;
            }
            
            System.out.print("Enter Y or y to go again- ");
            String goAgain = scan.next();
            
            switch (goAgain) {
                case "Y":
                case "y": break;
                default: return;
            }
        }
    }
}