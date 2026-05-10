package TwoD_Array;

import java.util.Scanner;

public class min_ele_in_a_row {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[3][4];

    System.out.println("Enter the array elements:");
    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[0].length; j++){
        arr[i][j] = sc.nextInt();
      }
      System.out.println();
    }

    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[0].length; j++){
        System.out.print(arr[i][j] + " "); 
      }
      System.out.println();
    }

      for(int i =0; i<arr.length; i++){
        int min = arr[i][0];
        for(int j=0; j<arr[0].length; j++){
          if(arr[i][j]<=min){
            min = arr[i][j];
          }
         
        }
         System.out.println(i+ " "+min);
      }
      

    }
  
    
}
