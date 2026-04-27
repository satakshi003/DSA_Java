package Arrays;

import java.util.Scanner;

public class p9 {

  public static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array:");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the array elements: ");
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }

    int start = 0;
    int end = n-1;

    while(start < end){
      swap(arr, start, end);
      start++;
      end--;
    }
    for(int i = 0; i<n; i++){
      System.out.print( arr[i] + " ");
    }
      

  
    }  
}
