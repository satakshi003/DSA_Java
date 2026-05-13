package Recursion;

import java.util.Scanner;

public class print1ton {
  public static void print(int n, int x){
    if(n == x+1) return;
    System.out.println(n);
    print(n+1, x);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    System.out.println();
    print(1, input);
  }
}
