package LinkedList;

public class QueueUsingArray {
    int a[];
    int front;
    int size;
    public QueueUsingArray(){
        a=new int[10];
        size=0;
        front=0;
    }
    public QueueUsingArray(int cap){
        a=new int[cap];
        size=0;
        front=0;
    }
    public void enqueue(int value){
        if(size==a.length){
            System.out.println("Queue is full");
            return;
        }
        int rear=(front+size)%a.length;
        a[rear]=value;
        this.size++;
    }
    public int deque(){
        if(this.size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int val=a[front];
        this.size--;
        front=(front+1)%a.length;
        return val;
    }
    public int peek(){
        if(size==0){
           // System.out.println("Queue is empty");
            return -1;
        }
        return a[front];
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            int idx=(front+i)%a.length;
            System.out.println(a[idx]+" ");
        }
    }
}
