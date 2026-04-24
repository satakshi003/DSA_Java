package Arrays;

import java.util.Scanner;

public class p3 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array:");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the array elements: ");
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }

    int ans = arr[0];
    for(int i = 0; i<n; i++){
      
        if(arr[i]> ans){
          ans = arr[i];
        }
        
      }
      System.out.print(ans + " ");
    }
  
  
  
}
