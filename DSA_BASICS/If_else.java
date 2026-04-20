package DSA_BASICS;

import java.util.Scanner;

public class If_else {
  public static void main(String[] args) {
    System.out.println("Enter a positive number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if(n%2 == 0){
      System.out.println("It is an even number.");
    }else{
      System.out.println("It is an odd number.");
    }

    
  }
}
