package StriverSheet.Arrays;


public class p13 {
  static int[] addEle(int[] arr, int pos, int x){
    int[] newArr = new int[arr.length+1];
    int n = arr.length;
    for(int i = 0; i<pos; i++ ){
      newArr[i] = arr[i];
    }
    newArr[pos] = x;

    for(int i = pos; i<n; i++){
      newArr[i+1] = arr[i];
    }
    return newArr;
  }
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6};
    int [] ans = addEle(array, 2, 8);
    for(int i = 0; i<ans.length; i++){
      System.out.print(ans[i]+" ");
    }
  }
}
