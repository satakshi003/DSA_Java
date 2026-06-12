package StriverSheet.Arrays;

public class p5 {
  public static void reverse(int[] arr){
    int n = arr.length;
    int start = 0;
    int end = n-1;
    while(start<=end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    
  }

  public static void main(String[] args) {
    int[] array = {-2, 2, 3, 4, 5, 6};
    reverse(array);
    for(int i = 0; i<array.length; i++){
      System.out.print(array[i]+" ");
    }
  }
}
