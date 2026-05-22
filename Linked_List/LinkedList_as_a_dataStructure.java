package Linked_List;

public class LinkedList_as_a_dataStructure {
   static class Node { //user defined data type
    int val;
    Node next; 
    Node(int val){
      this.val = val;
    }
  }

static class LinkedList{//user defined data structure
  Node head;
  Node tail;
  int size;

  void addAtTail(int val){
    Node temp = new Node(val);
    if(head == null){
      head = tail = temp;
    }
    else{
    tail.next = temp;
    tail = temp;
    }
    size++;
  }

  void addAtHead(int val){
    Node temp = new Node(val);
    if(head == null){
      head = tail = temp;
    }
    else{
      temp.next = head;
      head = temp;
    }
    size++;
  }

  void deleteAtHead(){
    if(head == null) {
      System.out.println("no node present");
    }
    else if(head == tail){
      head = null;
    }
    else{
      head = head.next;
    }
    
    size--;
  }

  void search(int val){
    int position = 0;
    if(head == null){
      System.out.println("no node present");
    }
    else if(head == tail && head.val == val){
      System.out.print("element found"+ " "+ position);
    }
    else{
      Node temp = head;
      while(temp != null){
        if(temp.val == val){
          System.out.print("element found"+" "+position);
          return;
        }
        temp = temp.next;
        position++;
      }
    }
    System.out.println("Element not found");
  }

  void insert_at_index(int idx, int val){
    Node temp = head;
    for(int i = 0;i< idx-1; i++){
      temp = temp.next;
    }
    Node newNode = new Node(val);
    if(head == null){
      head = newNode;
    }
    else {
       newNode.next = temp.next;
        temp.next = newNode;
        
    }
  }

  void delete_at_index(int idx){
    Node temp = head;
     if(head == null){
      System.out.println("Nothing to delete");
    }
    else if(head == tail){
      head = null;
    }
    else if(idx == 0){
      head = head.next;
      return;
    }
    else{
      for(int i = 0; i<idx-1; i++){
      temp = temp.next;
    }
      temp.next = temp.next.next;
    }
    size--;
  }
  
  void display(){
    if(head == null) return;

    Node temp = head;
    while(temp != null){
      System.out.print(temp.val+ " ");
      temp = temp.next;
    }
    System.out.println();
  }
 
}

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addAtTail(10);
    ll.addAtTail(20);
    ll.addAtTail(30);
    ll.addAtTail(40);
    ll.addAtTail(50);
    ll.addAtHead(60);
    ll.addAtHead(70);
    ll.display();
    //ll.deleteAtHead();
    //ll.insert_at_index(2, 30);
    ll.delete_at_index(4);
    ll.display();
    ll.search(60);
    System.out.println("Size"+ll.size);
  }
}
