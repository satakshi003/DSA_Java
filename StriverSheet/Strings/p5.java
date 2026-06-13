package StriverSheet.Strings;

public class p5 {
  static String removeVowels(String str){
    int n = str.length();
    str = str.toLowerCase();
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i<n; i++){
      char ch = str.charAt(i);
      if(Character.isLetter(ch)){
        sb.append(ch);
      }
    }
    String ans = sb.toString();
    return ans;
  }

  public static void main(String[] args) {
    String str = "take12% *&u ^$#forward";
    String result = removeVowels(str);
    System.out.println(result);
  }
}
