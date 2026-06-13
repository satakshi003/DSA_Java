package StriverSheet.Strings;

public class p3 {
  static void number(String str){
    str = str.toLowerCase();
    int n = str.length();
    int countV = 0;
    int countC = 0;
    int countS = 0;
    for(int i = 0; i<n; i++){
      char ch = str.charAt(i);
      if(ch==' '){
        countS++;
      }
      else if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
        countV++;
      }
      else{
        countC++;
      }
    }
    System.out.println(countS);
    System.out.println(countV);
    System.out.println(countC);
  }
  public static void main(String[] args) {
    String str = "Take u forward is Awesome";
    number(str);
  }
}
