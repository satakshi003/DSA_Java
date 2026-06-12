package StriverSheet.Arrays;

public class p3 {
  public static int sec_min(int[] arr){
    int firstMin = Integer.MAX_VALUE;
    for(int i = 0; i<arr.length; i++){
      if(arr[i]<firstMin){
        firstMin = arr[i];
      }
    }
    int secMin = Integer.MAX_VALUE;
    for(int i = 0; i<arr.length; i++){
      if(arr[i] != firstMin){
        if(arr[i]<secMin){
          secMin = arr[i];
        }
      }
    }
    return secMin;
  }

 

  public static void main(String[] args) {
    int[] array = {-2, 1, 3, 4, 5, 6};
    int ans = sec_min(array);
    System.out.println(ans);
  }
}
