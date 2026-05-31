package Stacks;

import java.util.Stack;

public class balance_brackets {

  public static boolean sameStyle(char ch1,char ch2 ){
    if(ch1=='(' && ch2==')') return true;
    else if(ch1=='[' && ch2==']') return true;
    else if(ch1=='{' && ch2=='}') return true;
    else{
      return false;
    }
  }

  public static boolean isBalanced(String s){
    Stack<Character> st = new Stack<>();
    for(int i = 0; i<s.length(); i++){
      char ch = s.charAt(i);
      if(ch=='{'||ch=='['||ch=='('){
        st.push(ch);
      }
      else{
        if(st.size()==0) return false;
        char top = st.peek();
        if(sameStyle(top, ch))st.pop();
        else return false;
      }
      
    }
    return true;
  }
  public static void main(String[] args) {
    String input = "{[()]}";
    System.out.println(isBalanced(input));
  }
}
