package StriverSheet.Strings;

public class p8 {
  static int sum(String str){
    int sum = 0;
    int n = str.length();
    int num = 0;
    for(int i = 0; i<n; i++){
      char ch = str.charAt(i);
      if(Character.isDigit(ch)){
        num = num*10 + (ch - '0');
      }
      else{
        sum+=num;
        num = 0;
      }
    }
    sum+=num;
    return sum;
  }
  public static void main(String[] args) {
    String str = "sat143Ash5";
    int ans = sum(str);
    System.out.println(ans);
  }
}
