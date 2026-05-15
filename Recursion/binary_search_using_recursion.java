package Recursion;

public class binary_search_using_recursion {
  public static int search(int[] arr, int target, int start, int end){

    if(start>end) return -1;

    int mid = start + (end - start)/2;
    if(arr[mid] == target) return mid;
    else if(arr[mid] > target) return search(arr, target, start, mid-1);
    else return search(arr, target, mid+1, end);
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int n = arr.length;
    System.out.println(search(arr, 3, 0, n-1));
  }
}
