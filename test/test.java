import java.util.Random;
//define a class
public class test {
    
    //add main method
    public static void main(String[] args) {
        int [] array = {5, 9, 1, 4, 8, 2};
        
        for (int i = 0; i < 6; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        for (int i = 1; i < 6; i++) {
            int key = array [i];
            int j;
            for (j = i - 1; j >= 0 && array [j] > key; j--) {
                array [j + 1] = array [j]; 
            }
            array [j + 1] = key;
        }
        for (int i = 0; i < 6; i++){
            System.out.print(array[i] + " ");
        }
        
    }
}