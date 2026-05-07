package Strings;

import java.util.Scanner;

public class vowelsInAString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String:");
    String s = sc.nextLine();
    int n = s.length();
    int count = 0;
    for(int i = 0; i<n; i++){
      if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'|| s.charAt(i) == 'u'||s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'|| s.charAt(i) == 'U'){
        count ++;
      }
    }
    System.out.println("The no. of vowels are: " + " " + count);
  }
}
