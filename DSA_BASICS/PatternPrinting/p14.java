package DSA_BASICS.PatternPrinting;

import java.util.Scanner;

public class p14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of n:");
    int n = sc.nextInt();
    

    for(int row = 1; row<=n; row++){
      
      int count = 1;
      for(int col=1; col<=row; col++){
        
          System.out.print( count + " " );
       count = count + 2;
        
      }
      System.out.println();
    }
  }
  
}
