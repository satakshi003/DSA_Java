package Strings;

import java.util.Scanner;

public class builtInMethods {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String");
    String str = sc.nextLine();

    System.out.print(str.lastIndexOf('t'));
  }
}
