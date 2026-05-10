package TwoD_Array;

import java.util.Scanner;

public class sum_2DArray {
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

    int sum = 0;
    for(int i =0; i<arr.length; i++){
      for(int j =0; j<arr[0].length; j++){
        sum += arr[i][j];
      }
    }

    System.out.println("Sum is:" + sum);

  }
}

