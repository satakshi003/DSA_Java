package Recursion;

import java.util.Scanner;

/*public class print1ton {
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
}*/

//using global variable

/*public class print1ton {
  static int n;
  public static void print( int x){
    if(n == x+1) return;
    System.out.println(n);
    n++;
    print( x);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    n = sc.nextInt();
    System.out.println();
    print( input);
  }
}*/

//using same backward printing logic but changing the order of printing
public class print1ton {
   public static void print(int n){
    if(n==0) return;
    print(n-1); //this is changed
    System.out.println(n);
  }

  public static void main(String[] args) {
    print(5);
  }
}