package Sorting.BinarySearch;

public class binarySearch {
  public static void main(String[] args) {
    int[] arr = {3, 7, 11, 12, 17, 18, 23, 27, 29};
    int target = 27;
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
        start = mid +1;
      }
      else{
        end = mid - 1;
      }
    }
  }
}
