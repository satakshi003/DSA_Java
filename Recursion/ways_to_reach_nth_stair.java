package Recursion;

public class ways_to_reach_nth_stair {
   public static int nthStair(int n){
    if(n==1)return 1;
    else if(n==2) return 2;
    else{
      return (nthStair(n-1)+nthStair(n-2)); //double function call
    }
  }
  public static void main(String[] args) {
    System.out.println(nthStair(5));
  }
}
