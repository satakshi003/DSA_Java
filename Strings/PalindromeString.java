package Strings;

public class PalindromeString {
  public static void main(String[] args) {
    String original = "malayalam";
    String reversed = "";
    int n = original.length();
    for(int i = n-1; i>=0; i--){
      reversed += original.charAt(i);
    }

    if(reversed.equals(original)){
      System.out.print("The string is palindrome.");
    }
    else{
      System.out.print("The string is not palindrome in nature.");
    }
  }
}
