package IntroductionJava.BàiTap.Bai10;

public class MyListTest {
    public static void main(String[] args) {
        MyList <Integer> ML = new MyList<Integer>();
        ML.add(0,((int)Math.round(Math.random()*10+1)));
        ML.add(1,((int)Math.round(Math.random()*10+1)));
        ML.add(2,((int)Math.round(Math.random()*10+1)));
        ML.add(3,((int)Math.round(Math.random()*10+1)));
        ML.add(4,11);

        ML.show();
//        ML.remove(1);
//        ML.show();

        if (ML.contains(5)){
            System.out.println("Yes");
        } else System.out.println("No");

        System.out.println("Tìm thấy tại vị trí: "+ML.indexOf(11));

    }
}
