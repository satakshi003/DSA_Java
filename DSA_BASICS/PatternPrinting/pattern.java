package DSA_BASICS.PatternPrinting;

public class pattern {
  public static void main(String[] args) {
    int[] arr = {4, 3, 6, 1, 3, 5};
    int max = 0;
    for(int x: arr){
      max = Math.max(max, x);
    }
    for(int i = 1; i <= max; i++){
      for(int j = 0; j<arr.length; j++){
          if(arr[j]>= i){
            System.out.print("* ");
          }
          else{
            System.out.print("  ");
          }
          
        
      }
      System.out.println();
    }
  }
}
