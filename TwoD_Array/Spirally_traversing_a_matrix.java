package TwoD_Array;

import java.util.Scanner;

public class Spirally_traversing_a_matrix {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[4][4];

    System.out.println("Enter the array elements:");
    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[0].length; j++){
        arr[i][j] = sc.nextInt();
      }
      System.out.println();
    }

    int row = arr.length;
    int col = arr[0].length;
    int top = 0, bottom = row-1;
    int left = 0, right =col-1;

    while(top<=bottom && left<=right){
      for(int i = left; i<= right; i++){
        System.out.print(arr[top][i]+ " ");
      }
      top++;
      for(int i =top; i<=bottom; i++){
        System.out.print(arr[i][right] + " ");
      }
      right--;
      if(top<=bottom){
        for(int i = right; i>=left; i--){
        System.out.print(arr[bottom][i] + " ");
      }
      bottom--;
      }
      
      if(left<=right){
        for(int i =bottom; i>=top; i--){
        System.out.print(arr[i][left]+ " ");
      }
      left++;
    }
  }
 System.out.println();

    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[0].length; j++){
        System.out.print(arr[i][j]+ " ");
      }
      System.out.println();//print matrix
    }

  }
}



