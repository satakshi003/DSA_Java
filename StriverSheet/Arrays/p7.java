package StriverSheet.Arrays;
import java.util.Arrays;

public class p7 {
  public static void reverse(int[]arr, int start, int end){
    int n = arr.length;
    while(start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
 public static void inDec(int[] arr){
  Arrays.sort(arr);
  int n = arr.length;
  int i = 0; 
  int j = n-1;
  int mid = i+(j-i)/2;
  reverse(arr, mid+1, n-1);
 }
  public static void main(String[] args) {
    int[] array = {-2, 2, 3,1, 4, 5, 6};
    inDec(array);

    for(int i = 0; i<array.length; i++){
      System.out.print(array[i]+" ");
    }
  }
}
