package Recursion;

public class first_and_last_occurence_using_recursion {
  public static int firstOccurence(int[] arr, int target, int start, int end){
    if(start>end) return -1;
    int mid = start + (end - start)/2;
    if(arr[mid] == target){
    int  first = firstOccurence(arr, target, start, mid-1);
    if(first == -1){
      return mid;
    }
    else{
      return first;
    }
    }
    else if(arr[mid]> target){
      return firstOccurence(arr, target, start, mid-1);
    }
    else{
      return firstOccurence(arr, target,mid+1, end);
    }

  }
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4,5, 5};
    int n = arr.length;
    System.out.println(firstOccurence(arr, 5, 0, n-1));
  }
}
