package Sorting.BinarySearch;

public class squareRoot {
  public static void main(String[] args) {
    int x = 8;
    int start = 1;
    int end = x;
    int ans;
    
    while(start<=end){
      int mid = start + ((end - start)/2);
      if(mid <= x/mid){
        ans = mid;
        System.out.println(ans);
        start = mid + 1;
      }
      else{
        end = mid - 1;
      }
    }
  }
}
