package Linked_List;
//we can also create Node class here
//java only have one public class, but it can have many classes

public class NodeOfLinkedList {
  static class Node {
    int val;
    Node next; //default value is null
    //next is a reference variable that stores the address of another Node.
    Node(int val){
      this.val = val;
    }
  }

  public static void main(String[] args) {
    Node a = new Node(10);
    //a.val = 10;
    
    Node b = new Node(20);
   // b.val = 20;

    Node c = new Node(30);
    //c.val = 20;

    Node d = new Node(40);
    //d.val = 20;

    Node e = new Node(50);
    //e.val = 20;

  //linking every node to next node 
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
  }
}
