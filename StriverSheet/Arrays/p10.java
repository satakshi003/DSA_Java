package StriverSheet.Arrays;

public class p10 {
  public static int avg(int[] arr){
    int n= arr.length;
    int sum = 0;
    int avg = 1;
    for(int i = 0; i<n; i++){
      sum+=arr[i];
    }
    avg = sum/5;
    return avg;
  }
  public static void main(String[] args) {
    int [] arr = {1, 2, 3, 4, 5};
    int ans = avg(arr);
    System.out.println(ans);
  }
}
