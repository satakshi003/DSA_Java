package Recursion;

import java.util.Scanner;

public class reverse_num {
  public static int reverse(int n, int rev){
    if(n==0)return rev;
    int digit = n%10;
    return (reverse(n/10, (rev*10)+digit));
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(reverse(num, 0));
  }
}
