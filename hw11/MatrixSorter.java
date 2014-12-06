//John Luczkovich
//12/3/14
//CSE2
//
//hw11
//MatrixSorter

//this program randomly generates a 3d array
//it takes that array and prints out each of the 3 slabs
//it then finds the lowest number in the array
//then it sorts the third slab 
//  this sort is done through selection sorting each row
//  then a insertion sort is done to sort each column base on the first number in the array, the key

import java.util.Random;    //import random class

//define class
public class MatrixSorter {
    //define main method
    public static void main(String arg[]) {
        int mat3d[][][];    //delare 3d array
        mat3d = buildMat3d();   //calls method buildMat3d
        show(mat3d);    //calls show method to print array
        System.out.println("The smallest entry in the 3D matrix is " +
            findMin(mat3d));    //prints out lowest value in array and calls method findMin
        System.out.println("After sorting the 3rd matrix we get");  //prints to user
        sort(mat3d[2]); //calls sort method
        show(mat3d);    //calls show method
    }
    
    //buildMat3d method
    //creates a 3d array
    public static int [][][] buildMat3d() {
        int [][][] array = new int [3][7][9];   //declares the array
        
        //nested for loops that build the array by using the formula 3+2*s for the rows
        //and s+j+1 for the columns
        //a random number is generated in the range of 1 to 99 inclusive and stored in each position of the array
        for (int s = 0; s < 3; s++) {
            for (int j = 0; j < 3 + 2 * s; j++) {
                for (int c = 0; c < s + j + 1; c++) {
                    Random rand = new Random();
                    array [s][j][c] = rand.nextInt(99) + 1;
                }
            }
        }
        return array;
    }
    
    //show method that prints the array
    public static void show(int [][][] mat3d) {
        
        /*nested for loops that print the array such that
            -----------slab x
            x x 
            x x x
            x x x x
            x x x x x
            x x x x x x
        */
        for (int s = 0; s < 3; s++) {
            System.out.println("--------------------Slab " + (s + 1));  //prints out what slab is being printed
            for (int j = 0; j < 3 + 2 * s; j++) {
                for (int c = 0; c < mat3d[s][j].length; c++) {
                    if (mat3d[s][j][c] != 0) {
                        System.out.print(mat3d [s][j][c] + " ");
                    }
                }
                System.out.println();   //prints to next line
            }
        }
    }
    
    //finMin method
    //looks at each member of the array and compares it to what the current minimun val is
    //if te value is determined to be less then the min is set to the new value
    public static int findMin(int [][][] array) {
        int min = 100;  //sets the min to a value above the range
        
        //nested for loops that check each value
        for (int s = 0; s < 3; s++) {
            for (int j = 0; j < 3 + 2 * s; j++) {
                for (int c = 0; c < s + j + 1; c++) {
                    if (array [s][j][c] < min) {
                        min = array [s][j][c];  //sets the new min if determined to be less than old min
                    }
                }
            }
        }    
        return min;
    }
    
    //sort method
    //sorts each row
    //then sorts columns based on first value, the key
    public static void sort(int [][] array) {
        
        //sorts each row of the array using selection sort
        for (int j = 0; j < 7; j++) {
            for (int c = 0; c < j + 2; c++) {
                int min = array [j][c]; //sets the starting min
                int index = c;  //the place where the min is located
                
                for (int f = c + 1; f < j + 3; f++) {
                    if (min > array [j][f]) {
                        min = array [j][f]; //sets new min
                        index = f;  //sets new location
                    }
                }
                
                if (index != c) {
                    array [j][index] = array [j][c];    //swaps the values
                    array [j][c] = min;
                }
            }
        }
        
        //sorts each column based on the first value or the key
        for (int i = 1; i < 7; i++) {
            int[] key = array[i];   //sets the key equal to the array at i 
            int j;  
            for (j = i - 1; j >= 0 && array [j][0] > key[0]; j--) {
                array [j + 1] = array [j];  //sets the next array equal to the array equal to the previous array
            }
            array [j + 1] = key;    //sets the array at position equal to the key
        }
    }
}
