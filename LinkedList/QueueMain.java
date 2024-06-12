package LinkedList;

public class QueueMain {
    public static void main(String[] args) {
        QueueUsingArray q=new QueueUsingArray(4);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
       // System.out.println(q.deque());
        q.deque();
        q.enqueue(50);
        q.display();
    }
}
