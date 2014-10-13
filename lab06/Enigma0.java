/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;

public class Enigma0{

    public static void main(String[] arg){
    
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    
    int n = 0;
    
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }

    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
    
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
        line 12 was "public static void main(String args[]){
        changed to "public static void main(String[] args){
        line 17 added in "int n = 0"
        n was initialized and declared inside of a scope and must be initialized and declared outside
        line 20 "int" was removed as "n" was declared outside of the scope
        line 25 "int" was removed as "n" was declared outside of the scope
        line 29 removed "n" as it was already declared
 */
