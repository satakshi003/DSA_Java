package Recursion;

public class print_subsets_of_a_string {
  public static void subsets(String ans, String s, int index){
    if(index == s.length()){
      System.out.print(ans + " ");
      return;
    }
    char ch = s.charAt(index);
    subsets(ans+ch, s, index+1);
    subsets(ans, s, index+1);
  }
  public static void main(String[] args) {
    String  s = "abc";
    subsets("", s, 0); 
  }
}
