package StriverSheet.Strings;

public class p7 {
  static String removeBrackets(String str){
    StringBuilder sb = new StringBuilder();
    int n = str.length();
    for(int i = 0; i<n; i++){
      char ch = str.charAt(i);
      if(ch!='(' && ch!=')'){
        sb.append(ch);
      }
    }
    String ans = sb.toString();
    return ans;
  }
  public static void main(String[] args) {
    String str = "a+((b-c)+d)";
    String result = removeBrackets(str);
    System.out.println(result);
  }
}
