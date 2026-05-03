package Sorting.BinarySearch;

public class peakInMountainArray {
  public static void main(String[] args) {
    int[] arr = {2, 4, 6, 8, 10, 8, 5};
    int n = arr.length;
    int start = 1;
    int end = n-2;

    while(start<=end){
      int mid = start + ((end - start)/2);
      if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
        System.out.println("Index of peak element is:" + " " + mid);
        break;
      }
      else if(arr[mid]>arr[mid-1]){
        start = mid+1;
      }
      else{
        end = mid-1;
      }
    }
  }
}
