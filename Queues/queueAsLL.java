package Queues;

public class queueAsLL {
  static class Node{
    int val;
    Node next;
    Node(int val){
      this.val = val;
    }
  }
  static class Myqueue{
    Node head;
    Node tail;
    int size;

    public void add(int val){
      Node temp = new Node(val);
      if(head==null && tail==null){
        head=tail=temp;
      }
      else{
        tail.next = temp;
        tail = temp;
      }
    }

    public void remove(){
      if(head == tail){
        head = null;
      }
      else{
        head = head.next;
      }

    }

    public void display(){
      Node temp = head;
      while(temp!=null){
        System.out.print(temp.val+ " ");
        temp = temp.next;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Myqueue q = new Myqueue();
    q.add(10);
    q.add(20);
    q.add(30);
    q.display();
    q.remove();
    q.display();
  }
}
