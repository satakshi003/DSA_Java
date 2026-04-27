package Arrays;

import java.util.Scanner;

public class p12 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array:");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the array elements: ");
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    
    int sum_elements = 0;
    for(int i = 0; i<n; i++){
      sum_elements += arr[i];
    }

    int sum_numbers = 0;
    for(int i = 1; i<=n+1; i++){
      sum_numbers += i;
    }

     System.out.println("The missing number in the array:" +  (sum_numbers-sum_elements)); 
      
    }  
}
