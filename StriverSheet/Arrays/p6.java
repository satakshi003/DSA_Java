package StriverSheet.Arrays;
import java.util.HashMap;

public class p6 {
 public static void freq(int[] arr){
  int n = arr.length;
  HashMap<Integer, Integer> map = new HashMap<>();
  for(int i = 0; i<n; i++ ){
    if(map.containsKey(arr[i])){
      int freq = map.get(arr[i]);
      map.put(arr[i], freq+1);
    }
    else{
      map.put(arr[i], 1);
    }
  }
  for(int ele:map.keySet()){
    System.out.println(ele+" "+map.get(ele));
  }
  
 }

  public static void main(String[] args) {
    int[] array = {2, 2, 3, 3, 5, 6};
    freq(array);
    
  }
}
