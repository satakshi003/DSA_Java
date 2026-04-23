package DSA_BASICS;

import java.util.Scanner;

public class Methods {

  public static int fact(int x){
    int result = 1;
    for(int i = x; i>=1; i--){
      result *= i;  
    }
    return result; 
    
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n and r :");
    int n = sc.nextInt();
    int r = sc.nextInt();

    int a = fact(n);
    int b = fact(r);
    int c = fact(n-r);
    System.out.println("Combination:"+ a/(b*c) );
    System.out.println("Permutation:" + a/c);
  }
  
}
