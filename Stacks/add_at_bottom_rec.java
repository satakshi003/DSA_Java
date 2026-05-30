package Stacks;

import java.util.Stack;

public class add_at_bottom_rec {
  public static void pushAtBottom(Stack<Integer> st, int ele){
    if(st.size() == 0){
      st.push(ele);
      return;
    }
    int top = st.pop();
    pushAtBottom(st, ele);
    st.push(top);
  }
  public static void main(String[] args) {
     Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(40);
        st.push(-2);
        st.push(30);
        st.push(80);

        pushAtBottom(st, 60);
        System.out.println(st);
  }
}
