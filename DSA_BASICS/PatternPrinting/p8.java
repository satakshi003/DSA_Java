package DSA_BASICS.PatternPrinting;

import java.util.Scanner;

public class p8 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int n = sc.nextInt();
    

    for (int i = 0; i<n; i++){
      
      for(int j = 1 ; j<=i; j++){
      
      if(i%2 != 0){
         System.out.print( j  + " "); 
      }
      else{
        char ch = (char)('A' + j - 1 );
         System.out.print( ch + " " );
      }
     
    }
    System.out.println();
    }
    
    
  }
  
}
