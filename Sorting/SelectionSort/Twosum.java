package Sorting.SelectionSort;
import java.util.Arrays;
public class Twosum {
  public static void print(int[] arr) {
    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int target = 9;
    int[] arr = {7, 6, 4, 3, 2, 8, 10};
    Arrays.sort(arr);
    print(arr);
    int n = arr.length;
    int i = 0;
    int j = n-1;
    while(i<j){
      if(arr[i]+arr[j] == target){
        System.out.println(arr[i] + " " + arr[j]);
        i++;
        j--;
      }
      else if(arr[i]+arr[j] > target){
        j--;
      }
      else{
        i++;
      }
    }
    
  }
}
