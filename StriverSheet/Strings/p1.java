package StriverSheet.Strings;

public class p1 {
  static boolean palindrome(String str){
    int n = str.length();
    String reversed = "";
    for(int i = n-1; i>=0; i--){
      char ch = str.charAt(i);
      reversed+=ch;
    }
    if(reversed.equals(str)){
      return true;
    }
    else{
      return false;
    }
  }

  public static void main(String[] args){
    String str = "malayalam";
    System.out.println(palindrome(str));
  }
}
