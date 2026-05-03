package Sorting.BinarySearch;

public class firstOccurence {
  public static void main(String[] args) {
    int[] arr = {3, 1, 11, 12, 1, 18, 23, 27, 29};
    int target = 1;
    int n = arr.length;
    int start = 0;
    int end = n-1;
    int first = -1;

    while(start<=end){
      int mid = start+((end-start)/2);
      if(arr[mid] == target){
        first = mid;
        end = mid - 1;
      }
      else if(arr[mid] < target){
        start = mid +1;
      }
      else{
        end = mid - 1;
      }
    }
    System.out.print(first);
  }
}
