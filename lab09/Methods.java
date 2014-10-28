import java.util.Scanner;
public class Methods {
    public static int getInt(Scanner x) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter an int- ");
        
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.print("You did not enter an int. Try again- ");
        }
        
        return scan.nextInt();
    }
    
    public static int larger(int q, int w) {
        if (q > w) {
            return q;
        }
        else {
            return w;
        }
    }
    
    public static boolean ascending(int x, int y, int z) {
        if (x < y && y < z) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three ints");
        a = getInt(scan);
        b = getInt(scan);
        c = getInt(scan);
        System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b));
        System.out.println("The larger of " + a + ", " + b + ", and " + c +
            " is " + larger(a, larger(b, c)));
        System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b +
            ", and " + c + " are in ascending order");
    }
}