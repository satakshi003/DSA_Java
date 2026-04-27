package Arrays;

import java.util.Scanner;

public class p13 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array:");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the array elements: ");
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    
    int numberOfZeros = 0;
    int numberOfOnes = 0;
    for(int i= 0; i< n; i++ ){
      if(arr[i] == 0){
        numberOfZeros ++;
      }
      else{
        numberOfOnes ++;
      }
    }

    for(int i = 0; i< numberOfZeros; i++){
    arr[i] = 0;
      
    }
    for(int i = numberOfZeros; i<n ; i++){
    arr[i] = 1;
      
    }
    for(int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
    
    }  
}
