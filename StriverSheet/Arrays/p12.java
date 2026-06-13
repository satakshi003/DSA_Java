package StriverSheet.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class p12 {
  static void removeDuplicates(int[] arr){
    int n = arr.length;
    HashSet<Integer> set = new HashSet<>();
    for(int i = 0; i<n; i++){
      set.add(arr[i]);
    }
    ArrayList<Integer> list = new ArrayList<>(set);
    System.out.println(list);
    
  }
  public static void main(String[] args) {
    int[] array = {1, 1, 2, 3, 4, 4, 5};
    removeDuplicates(array);
    
  }
}
