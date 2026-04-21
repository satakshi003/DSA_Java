package DSA_BASICS.PatternPrinting;

import java.util.Scanner;

public class p9 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value  of n :");
    int n = sc.nextInt();
    

    for(int row = n; row>=1; row--){
      for(int col=row; col>=1; col--){
        System.out.print(" * ");
      }
      System.out.println();
    }

  }
}
