package TwoD_Array;

import java.util.Scanner;

public class transpose_of_matrix {
  public static void print(int[][] arr){
    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[0].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[3][3];

    System.out.println("Enter the array elements:");
    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[0].length; j++){
        arr[i][j] = sc.nextInt();
      }
      System.out.println();
    }

    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<=i; j++){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
    print(arr);
  }
}


