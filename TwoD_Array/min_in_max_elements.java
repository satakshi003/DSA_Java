package TwoD_Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class min_in_max_elements {
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


     ArrayList<Integer> maxElements = new ArrayList<>();
      for(int i =0; i<arr.length; i++){
        int max = arr[i][0];
        for(int j=0; j<arr[0].length; j++){
          if(arr[i][j]>max){
            max = arr[i][j];
      }
         
        }
        maxElements.add(max);
      }
      Integer min = Collections.min(maxElements);
      System.out.println("min among the max elements is:" + min);
      
    }
  
    
}


