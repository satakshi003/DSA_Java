package Recursion;

public class linear_search_using_recursion {
    public static boolean search(int[] arr, int index, int x){
      if(index == arr.length) return false;
      else if(arr[index] == x) return true;
      return (search(arr, index+1, x));
    }
    public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      System.out.println(search(arr, 0, 10));
    }
  }
  

