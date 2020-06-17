package IntroductionJava.BàiTap.Bai11.Queue;

public class Queue {
    class Node{
        public int data;
        public Node link;

        public Node(int data){
            this.data = data;
            this.link = null;
        }
    }

    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data){
        Node temp = new Node(data);
        if (this.front == null){
            this.front = temp;
        } else {
            this.rear.link = temp;
        }
        this.rear = temp;
        this.rear.link = this.front;
    }

    public void deQueue(){
        if (this.front == null){
            return;
        }
        if (this.front == this.rear){
            this.front = this.rear = null;
        } else {
            this.front = this.front.link;
            this.rear.link = this.front;
        }
    }
    public void print(){
        Node temp = this.front;
        while (temp.link != front){
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(temp.data);

    }

    public static void main( String[] args ) {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        System.out.println("First: ");
        queue.print();
        queue.deQueue();
        queue.deQueue();
        System.out.println("Second: ");
        queue.print();
//
//        queue.enqueue(9);
//        queue.print();



    }
}
