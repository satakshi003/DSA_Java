package StriverSheet.Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class p14 {
  static ArrayList<Integer> repeating(int[] arr){
    int n = arr.length;
    HashSet<Integer> set = new HashSet<>();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i<n; i++){
      if(set.contains(arr[i])){
        list.add(arr[i]);
      }
      else{
        set.add(arr[i]);
      }
    }
    return list;
  }
  public static void main(String[] args) {
    int[] array = {1, 1, 2, 3, 4, 4, 4, 4, 5, 2 };
    ArrayList<Integer> result = repeating(array);
    System.out.print(result);
  }
}
