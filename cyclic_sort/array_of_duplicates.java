package cyclic_sort;

public class array_of_duplicates {
   public static int[] duplicate(int[] arr){
    int i = 0;
    int j = 0;
    int n = arr.length - 1;
    int size = arr.length + 1;
    int[] nums = new int[size];
    while(i<arr.length){
      if(arr[i] == i+1 || arr[i]> n) i++;
      else{
        int ele = arr[i] - 1;
        
        if(arr[ele] == arr[i]){
           boolean found = false;

    for(int k = 0; k < size; k++){
        if(nums[k] == arr[i]){
            found = true;
            break;
        }
    }

    if(!found){
        nums[j] = arr[i];
        j++;
    }
  i++;
          
        }
        
        else{
        int temp = arr[i];
        arr[i] = arr[ele];
        arr[ele] = temp;
        }
       
      }
      
    }
     return nums;
   
  }

  public static void main(String[] args) {
    int[] array = {2, 2, 3, 3, 3, 7};
    int[] ans = duplicate(array);
    for(int i = 0; i<ans.length; i++){
      if(ans[i] != 0){
        System.out.print(ans[i] + " ");
      }
      
    }
  }
}
