package TwoD_Array;

import java.util.Scanner;

public class maxElement {
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

    int max = arr[0][0];
    for(int i =0; i<arr.length; i++){
      for(int j =0; j<arr[0].length; j++){
        if(arr[i][j] > max){
          max = arr[i][j];
        }
      }
    }

    System.out.println("Max is:" + max);

    int sec_max = arr[0][0];
      for(int i =0; i<arr.length; i++){
      for(int j =0; j<arr[0].length; j++){
        if(arr[i][j] != max){
          sec_max = Math.max(arr[i][j], sec_max);
        }
      }
    }
    System.out.println("Sec_max  is:" + sec_max);

  }
}


