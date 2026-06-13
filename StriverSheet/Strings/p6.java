package StriverSheet.Strings;

public class p6 {
  static String reverse(String str){
    char[] arr = str.toCharArray();
    int n = arr.length;
    int start = 0;
    int end = n-1;
    while(start<end){
      char temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return new String(arr);
  }
  public static void main(String[] args) {
    String str = "I am iron man";
    String ans = reverse(str);
    System.out.print(ans+" ");
   
  }
}
