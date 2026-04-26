package Arrays;

import java.util.Scanner;

public class p8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array:");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the array elements: ");
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }

    int firstMax = arr[0];
    for(int i = 0; i<n; i++){
       if(arr[i] > firstMax){
        firstMax = arr[i];
       }
    }

    int secondMax = arr[0];
    for(int i = 0; i<n; i++){
      if(arr[i] != firstMax){
        secondMax = Math.max(secondMax, arr[i]);
      }
    }
    System.out.println("The second max is:" + secondMax);
  }
}
