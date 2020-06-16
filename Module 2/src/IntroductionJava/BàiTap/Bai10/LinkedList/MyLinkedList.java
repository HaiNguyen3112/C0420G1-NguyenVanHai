package IntroductionJava.BàiTap.Bai10.LinkedList;
import java.util.LinkedList;

public class MyLinkedList<E> {
    private Node head;
    private int numNode = 0;

    public MyLinkedList(){
        head = new Node();
    }

    public MyLinkedList(E data){
        head = new Node(data);
    }
    private class Node{
        private Node next;
        private E data;

        public Node(){
            this.data = null;
        }

        public Node(E data){
            this.data = data;
        }
        public E getData(){
            return this.data;
        }
    }
    public void add(int index, E e ){
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNode++;
    }
    public void addFirst(E e){
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNode++;
    }
    public void addLast(E e){
        Node temp = head;
        Node holder;
        for (int i =0;i<numNode;i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNode++;
    }


    public void remove(int index){
        Node temp = head;

        for (int i =0;i<index-1;i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        numNode--;
    }
    public boolean remove(E e){
        Node temp = head;
        for (int i =0;i<numNode;i++){
            if (e.equals(temp.data)){
                remove(i);
                return true;
            }

             temp = temp.next;
        }
        return false;
    }

    public int getSize(){
        return numNode;
    }
    public MyLinkedList clone() {
        MyLinkedList newLL = new MyLinkedList(head.data);
        Node temp = head;
        for (int i =0;i<numNode;i++){
            temp = temp.next;
            newLL.addLast(temp.data);
        }
        return newLL;
    }
    public boolean contains(E e){
        Node temp = head;
        int count = 0;
        do{
            if (e.equals(temp.data))
                return true;
             temp = temp.next;
             count ++;
        }while (count<=numNode);

        return false;
    }

    public E get(int index){
        Node temp = head;
        for (int i =0;i<index;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    public int indexOf(E e){
        Node temp = head;
        for (int i =0;i<numNode;i++){
            if (e.equals(temp.data))
                return i+1;
            temp= temp.next;
        }
        return -1;
    }
    public E getFirst(){
        return head.data;
    }
    public E getLast(){
        Node temp = head;
        for (int i=0;i<numNode;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    public void clear(){
        head = new Node();
        numNode =0;
    }


    public void printList(){
        Node temp = head;

        for (int i =0;i<numNode;i++){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}


