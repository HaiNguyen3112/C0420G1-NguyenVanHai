package IntroductionJava.BàiTap.Bai10.List;

import IntroductionJava.BàiTap.Bai10.List.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> ML = new MyList<Integer>();
        ML.add(0,1);
        ML.add(1,2);
        ML.add(2,3);
        ML.add(3,4);
        ML.add(4,11);


        ML.show();
        ML.add(2,60);
        System.out.println("-----------");
        ML.show();
//        ML.remove(1);
//        ML.show();

        if (ML.contains(5)){
            System.out.println("Yes");
        } else System.out.println("No");

        System.out.println("Tìm thấy tại vị trí: "+ML.indexOf(11));

    }
}
