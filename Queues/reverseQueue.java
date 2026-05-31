package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class reverseQueue {

  public static void reverse(Queue<Integer> q){
    int[] arr = new int[q.size()];
    for(int i = 0; i<arr.length; i++){
      arr[i] = q.remove();
    }
    for(int i = arr.length-1; i>=0; i--){
      q.add(arr[i]);
    }
  }

  public static void reverseUpToK(Queue<Integer> q, int k){
    int n = q.size();
    int[] arr = new int[k+1];
    for(int i = 0; i<=k; i++){
      arr[i] = q.remove();
    }
    for(int i = arr.length-1; i>=0; i--){
      q.add(arr[i]);
    }
    for(int i = 0; i<n-k-1; i++){
      q.add(q.remove());
    }
  }

  
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    //reverse(q);
    reverseUpToK(q, 2);
    System.out.println(q);
  }
}
