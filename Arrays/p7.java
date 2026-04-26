package Arrays;

import java.util.Scanner;

public class p7 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array:");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the array elements: ");
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter the target number:");
    int target = sc.nextInt();

    for(int i = 0; i<n; i++){
       for(int j = i + 1; j<n; j++){
        if(arr[i] + arr[j] == target){
          System.out.println("The indexes are: " + i + " " + j );
          System.out.println("The elements are:" + arr[i] + " " + arr[j]);
          break;
        }
       }
      
    }
      
    
      
}
}
