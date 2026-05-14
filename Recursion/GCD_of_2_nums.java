package Recursion;

public class GCD_of_2_nums {
 /*  public static void main(String[] args) {
    int num1 = 12;
    int num2 = 16;
    int gcd = 0;
    
    for(int i = 1; i<Math.min(num1, num2); i++){
      if(num1%i == 0 && num2%i == 0){
        gcd = i;
      }
    }
    System.out.println(gcd);
  }*/

    //GCD using Recursion
    public static int gcd(int a, int b){
      if(a==0){
        return b;
      } 
      return (gcd(b%a, a));
    }
    public static void main(String[] args) {
      System.out.println(gcd(12, 16));
    }
}
