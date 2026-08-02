package Binary_Trees;

public class implementation {
  static class Node{
    int val;
    Node left;
    Node right;
    
    Node(int val){
      this.val = val;
    }
  }

  static void display(Node root){
    if(root == null) return;
     System.out.print(root.val + " ");
     display(root.left);
     display(root.right);
  }

  static int size(Node root){
    if(root == null) return 0;
    return (1+size(root.left)+size(root.right));
  }

  static int sum(Node root){
    if(root == null) return 0;
    return (root.val + sum(root.left) + sum(root.right));
  }

  static int product(Node root){
    if(root == null) return 1;
    return (root.val*product(root.left)*product(root.right));
  }

  static int maxEle(Node root){

    if(root == null) return Integer.MIN_VALUE;

    int leftMax = maxEle(root.left);
    int rightMax = maxEle(root.right);
    int maxOfTwoSide = Math.max(leftMax, rightMax);
    return Math.max(root.val, maxOfTwoSide);
  }

  static int levels(Node root){
    if(root == null) return 0;

    int rightLevel = levels(root.right);
    int leftLevel = levels(root.left);

    return 1+Math.max(rightLevel, leftLevel);
  }

   static void preOrder(Node root){
    if(root == null) return;
     System.out.print(root.val + " ");
     preOrder(root.left);
     preOrder(root.right);
  }

   static void inOrder(Node root){
    if(root == null) return;
     inOrder(root.left);
     System.out.print(root.val + " ");
     inOrder(root.right);
  }

  static void postOrder(Node root){
    if(root == null) return;
     postOrder(root.left);
     postOrder(root.right);
     System.out.print(root.val + " ");
  }

  public static void main(String[] args) {
    Node a = new Node(3);
    Node b = new Node(4);
    Node c = new Node(2);
    Node d = new Node(-1);
    Node e = new Node(1);
    Node f = new Node(6);
    Node g = new Node(9);

    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.left = f;
    c.right = g;

    display(a);
    System.out.println();
    System.out.println(size(a));
    System.out.println();
    System.out.print(sum(a));
    System.out.println();
    System.out.println(product(a));
    System.out.println();
    System.out.print(maxEle(a));
    System.out.println();
    System.out.println(levels(a));
    System.out.println();
    preOrder(a);
    System.out.println();
    inOrder(a);
    System.out.println();
    postOrder(a);
  }
}
