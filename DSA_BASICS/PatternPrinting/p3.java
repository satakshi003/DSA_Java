package DSA_BASICS.PatternPrinting;

import java.util.Scanner;

public class p3 {

   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of rows and cols:");
    int row = sc.nextInt();
    int col = sc.nextInt();

    for(int i = 1; i<=row; i++){
      for(int j=1; j<=col; j++){
        System.out.print( (char)(j+96) + " " );
      }
      System.out.println();
    }

   }
  
}
