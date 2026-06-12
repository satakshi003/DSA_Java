package StriverSheet.Arrays;

public class p4 {
  public static int sec_max(int[] arr){
    int firstMax = Integer.MIN_VALUE;
    for(int i = 0; i<arr.length; i++){
      if(arr[i]>firstMax){
        firstMax = arr[i];
      }
    }
    int secMax = Integer.MIN_VALUE;
    for(int i = 0; i<arr.length; i++){
      if(arr[i] != firstMax){
        if(arr[i]>secMax){
          secMax = arr[i];
        }
      }
    }
    return secMax;
  }

 

  public static void main(String[] args) {
    int[] array = {-2, 1, 3, 4, 5, 6};
    int ans = sec_max(array);
    System.out.println(ans);
  }
}
