package Strings;
import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    String str1 = "tell";
    String str2 = "llet";

     if (str1.length() != str2.length()) {
            System.out.println("Not anagrams.");
        }
    
    char[] charArray1 = str1.toLowerCase().toCharArray();
    char[] charArray2 = str2.toLowerCase().toCharArray();

    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

   if(Arrays.equals(charArray1, charArray2)){
    System.out.println("Strings are anagrams");
   }
   else{
    System.out.println("Not anagrams");
   }

  }
}
