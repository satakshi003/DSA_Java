package DSA_BASICS;
import java.util.Scanner;

public class Loop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the ending number of GP series:");
    int n = sc.nextInt();

    System.out.println("Enter the starting number and common ratio of GP series:");
    int a = sc.nextInt();
    int r = sc.nextInt();
    

    for(int i = 1; i <= n; i++){
      a = a * r ;
      System.out.println("The GP Series is:"+ " " + a);
      
      
    }
  }
}
