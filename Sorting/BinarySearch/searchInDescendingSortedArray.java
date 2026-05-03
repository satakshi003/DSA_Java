package Sorting.BinarySearch;

public class searchInDescendingSortedArray {
  public static void main(String[] args) {
    int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int target = 5;
    int n = arr.length;
    int start = 0;
    int end = n-1;

    while(start<=end){
      int mid = start+((end-start)/2);
      if(arr[mid] == target){
        System.out.println("Element found at index " + " "+ mid);
        break;
      }
      else if(arr[mid] < target){
        end = mid - 1;
      }
      else{
        start = mid +1;
      }
    }
  }
}
