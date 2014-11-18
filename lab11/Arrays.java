import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] list = new int[10];
        
        System.out.print("Enter 10 ints- ");
        
        for (int i = 0; i < 10; i++) {
            list[i] = scan.nextInt();
        }
        
        int min = list[0];
        
        for (int i = 1; i < 10; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        System.out.println("The lowest entry is " + min);
        
        int max = list[0];
        for (int i = 1; i < 10; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        System.out.println("The highest entry is " + max);
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + list[i];
        }
        System.out.println("The sum is " + sum);
        
        int[] revList = new int[10];
        
        for (int i = 0; i < 10; i++) {
            int temp = list[9 - i];
            revList[i] = temp;
            System.out.println("   " + list[i] + "   " + revList[i]);
        }
    }
}
