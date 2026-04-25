package Arrays;

import java.util.Scanner;

public class p4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array:");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the array elements: ");
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }

    for(int i = 0; i<n; i++){
      if(i%2 == 0){
        arr[i] += 10;
      }
      else{
        arr[i] *= 2;
      }
      System.out.print(arr[i] + " ");
    }

      
}
  
  
}
