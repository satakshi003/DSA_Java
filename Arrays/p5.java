package Arrays;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array:");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the array elements: ");
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter the number to search in array:");
    int x = sc.nextInt();

    boolean found = false;

    for(int i = 0; i<n; i++){
      if(x%arr[i] == 0){
        found = true;
        break;
      }
      
    }
      if(found){
            System.out.println(x + " is present in the array");
        } else {
            System.out.println(x + " is not present in the array");

      
}
  
    }  
}
