package Arrays;

import java.util.Scanner;

public class p15 {
  public static void swap(int[] arr, int x, int y){
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
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
    
    for(int i = 0; i < n-1; i=i+2){
      swap(arr, i, i+1);
    }

    for(int i = 0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
   
   
    }  
}
