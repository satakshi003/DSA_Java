package Recursion;

import java.util.Scanner;

public class a_raised_to_power_b {
  /*
  //IN TIME COMPLEXITY OF O(b)
  public static int power(int a, int b){
    if( b==0 ) return 1;
    return (a* power(a, b-1));
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int pow = sc.nextInt();

    System.out.println(power(num, pow));
  }*/

//IN TIME COMPLEXITY OF O(logb)
    public static int power(int a, int b){
    if( b==0 ) return 1;
    int call = power(a, b/2);
    if(b%2 == 0){
      return (call*call);
    }
    else{
      return (call*call*a);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int pow = sc.nextInt();

    System.out.println(power(num, pow));
  }
}
