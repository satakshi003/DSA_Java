package StriverSheet.Strings;

public class p2 {
   static boolean palindrome(String str){
    int n = str.length();
    str = str.toLowerCase();
    String cleaned = "";
    for(int i = 0; i<n; i++){
      char ch = str.charAt(i);
      if(Character.isLetterOrDigit(ch)){
        cleaned+=ch;
      }
    }
    String reversed = "";
    for(int i = cleaned.length()-1; i>=0; i--){
      char ch = cleaned.charAt(i);
      reversed+=ch;
    }
    if(cleaned.equals(reversed)){
      return true;
    }
    else{
      return false;
    }
    
  }

  public static void main(String[] args){
    String str = "Was it a car or a cat I saw?";
    System.out.println(palindrome(str));
  }
}
