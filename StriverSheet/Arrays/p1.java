package StriverSheet.Arrays;

public class p1 {
  public static int smallest(int[] arr){
    int min = Integer.MAX_VALUE;
    for(int i = 0; i<arr.length; i++){
      if(arr[i]<min){
        min = arr[i];
      }
    }
    return min;
  }

  public static void main(String[] args) {
    int[] array = {-2, 2, 3, 4, 5, 6};
    int ans = smallest(array);
    System.out.println(ans);
  }
}
