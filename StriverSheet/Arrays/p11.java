package StriverSheet.Arrays;

import java.util.Arrays;

public class p11 {
  static int median(int[]arr){
    int n = arr.length;
    Arrays.sort(arr);
    int start = 0;
    int end = n-1;
    int mid = start+(end-start)/2;
    return arr[mid];
  }
  public static void main(String[] args) {
    int[] array = {5, 13, 9, 7, 1, 9, 2, 9,  11};
    int ans = median(array);
    System.out.println(ans);
  }
}
