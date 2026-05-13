package Recursion;

public class print_decreasing_increasing_order {
  public static void print(int n){
    if(n==0) return;
    System.out.println(n);
    print(n-1); 
    if(n!=1) System.out.println(n);
  }

  public static void main(String[] args) {
    print(5);
  }
}
