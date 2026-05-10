package TwoD_Array;

import java.util.Scanner;

public class print_snake_pattern {

  public static void reverseRow(int[][] matrix, int rowIndex) {
    if (matrix == null || matrix.length == 0) return;
    
    int cols = matrix[rowIndex].length;
    int start = 0;
    int end = cols - 1;
    
    while (start < end) {
        // Swap elements
        int temp = matrix[rowIndex][start];
        matrix[rowIndex][start] = matrix[rowIndex][end];
        matrix[rowIndex][end] = temp;
        
        start++;
        end--;
    }
}   
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

     for(int i = 0; i < arr.length; i++) {

            if(i % 2 != 0) {
                reverseRow(arr, i);
            }
        }

    
    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[0].length; j++){
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }

  }
}


