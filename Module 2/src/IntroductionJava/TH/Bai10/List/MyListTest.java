package IntroductionJava.TH.Bai10.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(7);
        listInteger.add(5);
        listInteger.add(4);

       System.out.println("element 2: "+listInteger.get(2));
//        listInteger.get(-1);
//        System.out.println("element -1: " + listInteger.get(1));
    }
}
