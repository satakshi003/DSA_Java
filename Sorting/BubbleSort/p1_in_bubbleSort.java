//MOVE ALL ZEROS TO END

package Sorting.BubbleSort;

public class p1_in_bubbleSort {
  public static void print(int[] arr){
    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = {1, 0, -2, 3, 0, 4, 8, 6, 10, 12};
    int n = arr.length;
    print(arr);

    for(int i= 0; i<n-1; i++){
      boolean isSorted = true;
      for(int j = 0; j<n-1-i; j++){
        if(arr[j] == 0){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          isSorted = false;
        }
      }
      if(isSorted == true)
      break;
    }
    print(arr);
  }
}
