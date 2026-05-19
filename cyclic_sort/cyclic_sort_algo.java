package cyclic_sort;

public class cyclic_sort_algo {
  public static void cyclic_sort(int[] arr){
    int i = 0;
    int n = arr.length;
    while(i<n){
      if(arr[i] == i) i++;
      else{
        int ele = arr[i];

        int temp = arr[i];
        arr[i] = arr[ele];
        arr[ele] = temp;
      }
    }
  }

  public static void main(String[] args) {
    int[] array = {5, 1,2, 3,4, 6, 7, 0};
    cyclic_sort(array);

    for(int i = 0; i< array.length; i++){
      System.out.print(array[i] + " ");
    }
  }
}
