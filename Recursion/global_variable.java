package Recursion;

public class global_variable {
  static int x = 10;
  public static void print(){
    x = 20;
    System.out.println(x);
    
  }

  public static void main(String[] args) {
     x = 5;
    System.out.println(x);
    //print();
  }
}
