package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class addOne {
   
    public static void main(String[] args) {

    ArrayList<Integer> arr = new ArrayList<>();
    
    // Example input: 1 2 9
    arr.add(1);
    arr.add(2);
    arr.add(9);

    int carry = 1;

    for(int i = arr.size() - 1; i >= 0; i--){
      int sum = arr.get(i) + carry;

      if(sum <= 9){
        arr.set(i, sum);
        carry = 0;
        break;
      } else {
        arr.set(i, 0);
        carry = 1;
      }
    }

    // if carry still left
    if(carry == 1){
      arr.add(0, 1); // insert at beginning
    }

    System.out.println(arr);
   }
}
