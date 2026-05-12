package TwoD_Array;

import java.util.Scanner;

public class matrix_multiplication {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] arr1 = new int[2][2];
    int[][] arr2 = new int[2][2];

    System.out.println("Enter the array1 elements:");
    for(int i = 0; i<arr1.length; i++){
      for(int j = 0; j<arr1[0].length; j++){
        arr1[i][j] = sc.nextInt();
      }
      System.out.println();
    }
    System.out.println("Enter the array2 elements:");
    for(int i = 0; i<arr2.length; i++){
      for(int j = 0; j<arr2[0].length; j++){
        arr2[i][j] = sc.nextInt();
      }
      System.out.println();
    }

    int[][] ans = new int[2][2];

    for(int i =0; i<ans.length; i++){
      for(int j=0; j<ans[0].length; j++){
        ans[i][j] = 0;
        for(int k = 0; k<ans.length; k++){
          ans[i][j] += arr1[i][k] * arr2[k][j];
        }
      }
    }


   
    for(int i = 0; i<ans.length; i++){
      for(int j = 0; j<ans[0].length; j++){
        System.out.print(ans[i][j]+ " ");
      }
      System.out.println();//print matrix
    }

  }
}


