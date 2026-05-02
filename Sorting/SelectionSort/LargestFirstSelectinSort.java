package Sorting.SelectionSort;

public class LargestFirstSelectinSort {
  public static void main(String[] args) {
    int[] arr = {8, 4, 1, 9, -3, 6, 5};
    int n = arr.length;

    for(int i = n-1; i>=0; i--){
      int index = i;
      for(int j = i-1; j>=0; j--){
        if(arr[j]>arr[index]){
          index = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[index];
      arr[index] = temp;
    }
    for(int i = 0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
