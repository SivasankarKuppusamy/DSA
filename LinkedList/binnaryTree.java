package LinkedList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * InnerbinnaryTree
 */
 class Node {
    int value;
    Node left;
    Node right;
     Node(int data){
        this.value=data;
        left=right=null;
     }
}
public class binnaryTree {
  Node root;
  binnaryTree(){
    Scanner sc=new Scanner(System.in);
    root=CreateTree(sc);
  }
  Node CreateTree(Scanner sc){
    int data=sc.nextInt();
    if(data==-1){
        return null;
    }
    Node n=new Node(data);
    n.left=CreateTree(sc);
    n.right=CreateTree(sc);
    return n;
  }
  void display(){
    //preOrderPrint(root);
    //InOrderPrint(root);
   // PostOrderPrint(root);
   levelOrderPrint(root);
  }
private void preOrderPrint(Node root) {
    if(root==null){
        return;
    }
    System.out.println(root.value);
    preOrderPrint(root.left);
    preOrderPrint(root.right);
}
private void InOrderPrint(Node root) {
    if(root==null){
        return;
    }
    InOrderPrint(root.left);
    System.out.println(root.value);
    InOrderPrint(root.right);
}
private void PostOrderPrint(Node root) {
    if(root==null){
        return;
    }
    PostOrderPrint(root.left);
    PostOrderPrint(root.right);
    System.out.println(root.value);
}
public void levelOrderPrint(Node root){
    if(root==null){
        return;
    }
    Queue <Node> q=new LinkedList<>();
    q.offer(root);
    while (!q.isEmpty()) {
        Node f=q.poll();
        System.out.println(f.value);
        if(f.left!=null){
            q.offer(f.left);
        }
        if(f.right!=null){
            q.offer(f.right);
        }
    }
}
    
}