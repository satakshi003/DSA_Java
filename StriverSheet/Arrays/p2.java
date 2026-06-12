package StriverSheet.Arrays;

public class p2 {
  public static int smallest(int[] arr){
    int max = Integer.MIN_VALUE;
    for(int i = 0; i<arr.length; i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int[] array = {-2, 2, 3, 4, 5, 6};
    int ans = smallest(array);
    System.out.println(ans);
  }
}
