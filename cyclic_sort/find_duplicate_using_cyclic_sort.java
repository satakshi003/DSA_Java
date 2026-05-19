package cyclic_sort;

public class find_duplicate_using_cyclic_sort {
   public static int duplicate(int[] arr){
    int i = 0;
    int n = arr.length - 1;
    while(i<arr.length){
      if(arr[i] == i+1 || arr[i] == n) i++;
      else{
        int ele = arr[i] - 1;
        
        if(arr[ele] == arr[i]) return arr[i];
        
        else{
        int temp = arr[i];
        arr[i] = arr[ele];
        arr[ele] = temp;
        }
        
      }
      
    }
    return 0;
   
  }

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 3, 3, 7};
    int n = duplicate(array);
    System.out.println(n);
  }
}
