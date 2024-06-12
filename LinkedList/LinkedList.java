package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size=0;

    public LinkedList(int size) {
        this.size = size;
    }

    public LinkedList() {
    }
    class Node{
       private int value;
       private Node next;
    public Node(int value) {
        this.value = value;
    }
    public Node(int value, LinkedList.Node next) {
        this.value = value;
        this.next = next;
    }
   }
    public void insertFirst(int value) {
       Node node=new Node(value);
       node.next=head;
       head=node;
       if(tail==null){
        tail=head;
       }
       size+=1;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
    }
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node=new Node(val, temp.next);
        temp.next=node;
        size++;

    }
    public int deleteFirst(){
        int temp=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return temp;
    }
    public void insertLast(int value){
        Node node=new Node(value);
        if(tail==null){
            insertFirst(value);
            return;
        }
        tail.next=node;
        tail=node;
        size+=1;
    }
    public Node get(int index){
        Node temp=head;
        for (int i = 0; i <index; i++) {
            temp=temp.next;
        }
        return temp;
    }
    public Node find(int value){
        Node temp=head;
        while(temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public int deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        Node temp=get(size-2);
        int val=tail.value;
        tail=temp;
        temp.next=null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size){
            return deleteLast();
        }
        Node temp=get(index-1);
        Node temp2=get(index+1);
        Node deleted=get(index);
        temp.next=temp2;
        return deleted.value;
    }
}
