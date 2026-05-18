package Recursion;

public class count_inversions_using_recursion {
   public static int merge_sorted_arr(int[] a, int[] b, int[] ans){
    int i = 0;
    int j = 0;
    int k = 0;
    int count = 0;

    while(i<a.length && j<b.length){
      if(a[i] <= b[j]){
        ans[k] = a[i];
        i++;
        k++;
      }
      else{
        ans[k] = b[j];
        j++;
        k++;

        count += (a.length - i);
      }
    }
    while(i<a.length){
      ans[k] = a[i];
      i++;
      k++;
    }
    while(j<b.length){
      ans[k] = b[j];
      j++;
      k++;
    }
    return count;
  }


public static int mergeSort(int[] arr){
  int n = arr.length;
  if(n==1) return 0;

 int[] arr1 = new int[n/2];
 int[] arr2 = new int[n - n/2];

 for(int i = 0; i<arr1.length; i++){
    arr1[i] = arr[i];
 }

 for(int i = 0; i<arr2.length; i++){
  arr2[i] = arr[i + n/2];
 }
  int count = 0;
  count += mergeSort(arr1);
  count += mergeSort(arr2);
  count += merge_sorted_arr(arr1, arr2, arr);
 return count;
}
  public static void main(String[] args) {
     int[] array = {1, 2, 9, 4, 8, 6, 7, 5};
     System.out.println(mergeSort(array));
  }

}
