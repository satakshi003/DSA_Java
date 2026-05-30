package Stacks;

import java.util.Stack;

public class basics {
   public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(40);
        st.push(-2);
        st.push(30);
        st.push(80);

        int n = st.size();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
          arr[i] = st.pop();
        }

        for(int i = 0; i<arr.length; i++){
          st.push(arr[i]);
        }

        System.out.println(st);
   }
}
