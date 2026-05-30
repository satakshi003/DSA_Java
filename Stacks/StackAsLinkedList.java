package Stacks;

public class StackAsLinkedList {
 static class Node {
    int val;
    Node next;
    Node(int val){
      this.val = val;
    }
  }

  static class MyStack{
    Node head;
    int len;

    int peek(){
      if(head == null){
        System.out.println("Stack is empty");
        return -1;
      }
      return head.val;
    }

    int pop(){//delete at head
      if(head == null){
        System.out.println("Stack is empty");
        return -1;
      }
      else{
        int x = head.val;
        head = head.next;
        len--;
        return x;
      }
    }

    void push(int ele){ //add at head
      Node temp = new Node(ele);
      if(len == 0){
        head = temp;
      }
      else{
        temp.next = head;
        head = temp;
      }
      len++;
    }

    void display(){
      Node temp = head;
      while(temp!=null){
        System.out.println(temp.val);
        temp = temp.next;
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    MyStack st = new MyStack();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.display();
    st.pop();
    st.display();
    System.out.println(st.peek());
  }
}
