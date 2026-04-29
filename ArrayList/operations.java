package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class operations {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(25);
    arr.add(21);
    arr.add(18);
    arr.add(5);
    arr.add(10);

    System.out.println(arr.get(2)); // arr[2]
    arr.set(3, 20); //arr[3] = 50

    System.out.println(arr);//only to traverse the array, we don't do anything of our own
    int n = arr.size(); // arr.length
    for(int i=0; i<n; i++){
      System.out.print(arr.get(i) + " ");
    }
    for(int ele : arr){
      System.out.print(ele+" ");
    }

    arr.add(1, 100);
    System.out.print(arr);

    Collections.reverse(arr);
    System.out.print(arr);
  }
}
