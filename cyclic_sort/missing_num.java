package cyclic_sort;

public class missing_num {
  public static int missing(int[] arr){
    int i = 0;
    int n = arr.length + 1;
    while(i<arr.length){
      if(arr[i] == i+1 || arr[i] == n) i++;
      else{
        int ele = arr[i] - 1;
        int temp = arr[i];
        arr[i] = arr[ele];
        arr[ele] = temp;
      }
    }
    for(i = 0; i<arr.length; i++){
      if(arr[i] != i+1 ){
        return i+1;
      }
    }
    return n;
  }

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 6, 7};
    int n = missing(array);
    System.out.println(n);
  }
}
