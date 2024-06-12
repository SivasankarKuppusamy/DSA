package LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insertLast(10);
        l.insertLast(20);
        l.insertLast(30);
     //   l.insert(45, 1);
       // System.out.println(l.deleteFirst());
       // System.out.println(l.deleteLast());
        //System.out.println(l.delete(0));
        System.out.println(l.find(20));
        l.display();
    }
}
