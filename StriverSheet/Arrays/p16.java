package StriverSheet.Arrays;

public class p16 {
  static boolean isSubset(int[] arr1, int[]arr2){
    int i = 0; 
    int j = 0;
    while(i<arr1.length && j<arr2.length){
      if(arr2[j] == arr1[i]){
        i++;
        j++;
      }
      else{
        i++;
      }
    }
    if(j==arr2.length){
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 5, 5};
    int[] array2 = {1, 2, 6};
    System.out.println(isSubset(array1, array2) );
  }
}
