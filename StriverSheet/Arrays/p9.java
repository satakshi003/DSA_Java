package StriverSheet.Arrays;

public class p9 {

  static void reverse(int[] arr, int start, int end){
    int n = arr.length;
    while(start<=end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  public static int[] rotate(int[] arr, int k){
    int n = arr.length;
    reverse(arr, 0, k);
    reverse(arr, k+1, n-1);
    reverse(arr, 0, n-1);

    return arr;
  }
  public static void main(String[] args){
    int[] array = {1, 2, 3, 4, 5};
    int[] ans = rotate(array, 3);
  
    for(int i = 0; i<array.length; i++){
      System.out.print(array[i]+" ");
    }
  }
}
