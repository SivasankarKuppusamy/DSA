package LinkedList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {
    Node root;
    BinarySearchTree(){
        root=buildTree();
    }
    private Node buildTree() {
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node root=null;
        while(data!=-1){
            root=insert(root,data);
            data=sc.nextInt();
        }
        return root;
    }
    private Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<=root.value){
            root.left=insert(root.left, data);
        }
        else{
           root.right= insert(root.right, data);
        }
        return root;
    }
   void display(){
   // preOrderPrint(root);
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
      public boolean searchFn(int key){
            return searchHelper(root,key);
        }
        boolean searchHelper(Node root,int key){
            if(root==null){
                return false;
            }
            if(root.value==key) return true;
            if(key<root.value){
                return searchHelper(root.left, key);
            }
            if(key>root.value){
                return searchHelper(root.right, key);
            }
        return false;
        }
}
