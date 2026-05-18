package Recursion;

public class merge_sort {
  public static int[] merge_sorted_arr(int[] a, int[] b, int[] ans){
    int i = 0;
    int j = 0;
    int k = 0;

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
    return ans;
  }


public static int[] mergeSort(int[] arr){
  int n = arr.length;
  if(n==1) return arr;

 int[] arr1 = new int[n/2];
 int[] arr2 = new int[n - n/2];

 for(int i = 0; i<arr1.length; i++){
    arr1[i] = arr[i];
 }

 for(int i = 0; i<arr2.length; i++){
  arr2[i] = arr[i + n/2];
 }
 arr1 = mergeSort(arr1);
 arr2 = mergeSort(arr2);
 return (merge_sorted_arr(arr1, arr2, arr));
}
  public static void main(String[] args) {
    //int[] arr1 = {1, 3, 5, 6, 7};
    //int[] arr2 = {4, 5, 6, 7, 8, 9};
   //merge_sorted_arr(arr1, arr2);
     int[] array = {1, 2, 9, 4, 8, 6, 7, 5};
    array = mergeSort(array);
    for(int i = 0; i<array.length; i++){
      System.out.print(array[i] + " ");
    }
  }
}


