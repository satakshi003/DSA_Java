package Linked_List.Doubly_Linked_list;

public class Doubly_LL_as_DataStructure {
   static class ListNode { //user defined data type
    int val;
    ListNode next; 
    ListNode prev;
    ListNode(int val){
      this.val = val;
    }
  }
 static class DLL{
    ListNode head;
    ListNode tail;
    int size;

    void insertAtHead(int val){
      ListNode temp = new ListNode(val);
      if(head==null){
        head=tail=temp;
      }else{
        temp.next = head;
        head.prev = temp;
        head = temp;
      }  
      size++;            
    }

    void inserAtTail(int val){
      ListNode temp = new ListNode(val);
      if(head==null){
        head=tail=temp;
      }else{
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
      }
      size++;
    }

    void deleteAtHead(){
      if(head==null){
        System.out.println("No node present ");
      }else if(head == tail){
        head = null;
      }
      else{
        head = head.next;
        head.prev = null;
      }
    }

    void deleteTail(){
      if(head==null){
        System.out.println("No node present ");
      }else if(head == tail){
        tail = null;
      }
      else{
        tail = tail.prev;
        tail.next = null;
      }
    }

    void display(){
      ListNode temp = head;
      while(temp!=null){
        System.out.print(temp.val+" ");
        temp = temp.next;
      }
      System.out.println();
    }

    void rev_display(){
      ListNode temp = tail;
      while(temp!=null){
        System.out.print(temp.val+" ");
        temp = temp.prev;
      }
      System.out.println();
    }

     void insert_at_index(int val, int idx){
      ListNode newNode = new ListNode(val);
      ListNode temp = head;
      for(int i = 0; i<idx-1; i++){
        temp = temp.next;
      }
      if(head == null){
        head = newNode; 
      }
      else{
          newNode.next = temp.next;
          temp.next = newNode;
          newNode.prev = temp;
          newNode.next.prev = newNode;
      }
  }

  void delete_at_index(int idx){
    ListNode temp = head;
    for(int i = 0; i<idx-1; i++){
      temp = temp.next;
    }
    if(head == null){
      System.out.println("No node o delee");
    }
    else if(head == tail){
      head = tail = null;
    }
    else{
      if(temp.next.next == null){
        temp.next = null;
      }
      else{
        temp.next.next.prev = temp;
      temp.next = temp.next.next;
      
      }
      
    }
  }

  }

 

  public static void main(String[] args) {
    DLL list = new DLL();
    list.insertAtHead(10);
    list.inserAtTail(20);
    list.inserAtTail(30);
    list.inserAtTail(40);
    list.display();
    list.deleteAtHead();
    list.display();
    list.deleteTail();
    list.display();
    list.insert_at_index(5, 1);
    list.display();
    list.delete_at_index(2);
    list.display();
    list.rev_display();
  }
}
