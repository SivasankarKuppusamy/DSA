

import java.util.Scanner;

class Node{
    int value;
    Node next;
    Node(int value){
        this.value=value;
    }
}
public class LinkedList {
    Node head;
    Node tail;
    int size;
    public void insertEnd(int value){
        if(head==null){
            head=tail=new Node(value);
            size++;
        }
        else{
            Node n=new Node(value);
            tail.next=n;
            tail=n;
        }
    }
    public void print(){
        Node t=head;
        while(t!=null){
            System.out.print(t.value+"->");
            t=t.next;
        }
        System.out.println("end");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList l=new LinkedList();
        while(true){
            int value=sc.nextInt();
            if(value==-1){
                break;
            }
            l.insertEnd(value);
        }
        l.print();
    }
}
