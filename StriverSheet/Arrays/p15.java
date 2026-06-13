package StriverSheet.Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class p15 {
  static ArrayList<Integer> Nonrepeating(int[] arr){
    int n = arr.length;
    HashSet<Integer> set = new HashSet<>();
    for(int i = 0; i<n; i++){
      if(set.contains(arr[i])){
        set.remove(arr[i]);
      }
      else{
        set.add(arr[i]);
      }
    }
    ArrayList<Integer> list2 = new ArrayList<>(set);
    return list2;
  }
  public static void main(String[] args) {
    int[] array = {1, 2, 2, 3, 4, 5, 5};
    ArrayList<Integer> result = Nonrepeating(array);
    System.out.print(result);
  }
}
