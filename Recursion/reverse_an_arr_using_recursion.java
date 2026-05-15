package Recursion;

public class reverse_an_arr_using_recursion {
  public static void print(int[] arr, int index){
    if(index == arr.length) return;
    System.out.print(arr[index] + " ");
    print(arr, index+1);
  }
 
  public static void rev(int[] arr, int start, int end){
    if(start>=end) return ;
    else{
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
    }
     rev(arr, start+1, end-1);
  }
  public static void main(String[] args) {
    int[] arr={1, 2, 3, 4, 5};
    int n = arr.length;
    rev(arr, 0, n-1);
    print(arr, 0);
  }
}
