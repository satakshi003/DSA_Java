package TwoD_Array;

import java.util.Scanner;

public class row_max_sum {
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

    /*int row_sum1 = 0;
    int row_sum2 = 0;
    int row_sum3 = 0;
    for(int i =0; i<arr.length; i++){
      for(int j =0; j<arr[0].length; j++){
        if(i == 0){
          row_sum1 += arr[i][j];
        }
        else if(i == 1){
          row_sum2 += arr[i][j];
        }
        else{
          row_sum3 += arr[i][j];
        }
      }
    }
        int max_sum = 0;
        if(row_sum1>row_sum2 && row_sum1>row_sum3){
          max_sum = row_sum1;
        }
        else if(row_sum2>row_sum1 && row_sum2>row_sum3){
          max_sum = row_sum2;
        }
        else{
          max_sum = row_sum3;
        }
       System.out.println("Maximum row sum is: " + max_sum);*/


      int maxSum = Integer.MIN_VALUE;
      int row = -1;
      for(int i = 0; i<arr.length; i++){
        int sum = 0;
        for(int j=0; j<arr[0].length; j++){
          sum += arr[i][j];
        }
        if(sum > maxSum){
          maxSum = sum;
          row = i;
        }
      }
      System.out.println(row + " " + maxSum);

    }
  }
    

  



