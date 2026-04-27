package Arrays;

import java.util.Scanner;

public class p11 {
  public static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public static void reverse(int[] arr, int start, int end ) {
    

    while(start < end){
      swap(arr, start, end);
      start++;
      end--;
    }
    
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
    System.out.println("Enter the number to rotate the array with:");
    int x = sc.nextInt();

      x = x%n;
      reverse(arr, 0, x-1 );
      reverse(arr, x, n-1);
      reverse(arr, 0, n-1);
      
    for(int i = 0; i<n; i++){
      System.out.print( arr[i] + " ");
    }
      

  
    }  
}
