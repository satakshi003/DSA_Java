package Recursion;

public class recursive_print_arr {
  public static void recPrint(int[] arr, int index){
    if(index == arr.length) return;
    System.out.print(arr[index]);
    recPrint(arr, index+1);
  }
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    recPrint(arr, 0);
  }
}
