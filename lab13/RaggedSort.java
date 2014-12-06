import java.util.Random;

public class RaggedSort {

    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int [] [] array = new int [5] [17];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i * 3 + 5; j++) {
                array [i] [j] = rand.nextInt(40);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i * 3 + 5; j++) {
                System.out.print(array [i] [j] + " ");
            }
            System.out.println();
        }

        sort(array);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i * 3 + 5; j++) {
                System.out.print(array [i] [j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void sort(int [] [] array) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i * 3 + 4; j++) {
                int min = array [i] [j];
                int index = j;
                for (int k = j + 1; k < i * 3 + 5; k++) {
                    if (min > array [i] [k]) {
                        min = array [i] [k];
                        index = k;
                    }
                }
                if (min != j) {
                    array [i] [index] = array [i] [j];
                    array [i] [j] = min;
                }
            }
        }
    }
}