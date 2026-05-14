package Recursion;

public class fibonacci {
  public static int nthFibonacci(int n){
    if(n==0)return 0;
    else if(n==1) return 1;
    else{
      return (nthFibonacci(n-1)+nthFibonacci(n-2)); //double function call
    }
  }
  public static void main(String[] args) {
    System.out.println(nthFibonacci(2));
  }
}
