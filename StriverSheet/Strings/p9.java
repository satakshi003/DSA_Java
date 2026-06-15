package StriverSheet.Strings;



public class p9 {
  static String upLow(String word){
    int n = word.length();
    for(int i = 0; i<n; i++){
      char ch = word.charAt(i);
      if(i==0 || i==n-1){
        Character.toUpperCase(ch);
      }
    }
    return word;
  }
  static String fun(String str){
    String[] arr = str.split(" ");
    for(int i = 0; i<arr.length; i++){
      arr[i] = upLow(arr[i]);
    }
    
    String result = String.join(" ", arr);
    return result ;
  }

  public static void main(String[] args) {
    String str = "i Love you";
    String ans = fun(str);
    System.out.println(ans);
  }
}
