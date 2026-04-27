package Arrays;

import java.util.Scanner;

public class p10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array:");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the array elements: ");
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    
    int temp = arr[n-1];
    for(int i = n-2; i >= 0; i--){
      arr[i+1] = arr[i];
    }
    arr[0] = temp;

    System.out.println("The final rotated array:");
    for(int i = 0; i<n; i++){
      System.out.print( arr[i] + " ");
    }
      

  
    } 
  
}
