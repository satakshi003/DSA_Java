package Sorting.InsertionSort;

public class simpleInsertionSort {
  public static void main(String[] args) {
    int[] arr = {4, 1, 7, 3, 9, 2, 0, 8};
    int n = arr.length;
    for(int i = 1; i<n; i++){
      for(int j = i; j>0; j--){
        if(arr[j] < arr[j-1]){
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
        }
        else{
          break;
        }
      }
    }
    for(int i = 0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
