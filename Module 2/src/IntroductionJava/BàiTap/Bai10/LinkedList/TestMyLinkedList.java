package IntroductionJava.BàiTap.Bai10.LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(10);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(5);
        ll.addLast(7);
        ll.addLast(4);
        ll.printList();
        System.out.println("-------------------");

        System.out.println(" "+ll.get(5));
        System.out.println(""+ll.indexOf(7));
        System.out.println(""+ll.getFirst());
        System.out.println(""+ll.getLast());
        ll.clear();
        ll.printList();
//
//        MyLinkedList abc = ll.clone();
//
//        boolean check1 = ll.contains(4);
//        if (check1) System.out.println("yesssss");
//        else System.out.println("nooooooooo");

    }
}
