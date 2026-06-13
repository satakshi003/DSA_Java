package StriverSheet.Strings;

public class p4 {
  static String removeVowels(String str){
    int n = str.length();
    str = str.toLowerCase();
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i<n; i++){
      char ch = str.charAt(i);
      if(ch!='a'&& ch!='e' && ch!='i'&& ch!='o'&& ch!='u'){
        sb.append(ch);
      }
    }
    String ans = sb.toString();
    return ans;
  }

  public static void main(String[] args) {
    String str = "aehiort";
    String result = removeVowels(str);
    System.out.println(result);
  }
}
