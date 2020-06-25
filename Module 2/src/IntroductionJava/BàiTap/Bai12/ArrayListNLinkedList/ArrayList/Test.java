package IntroductionJava.BàiTap.Bai12.ArrayListNLinkedList.ArrayList;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main( String[] args ) {
        ProductManager<Product> productProductManager = new ProductManager<>();
        Product pd1 = new Product("abc","Hải",20000);
        Product pd2 = new Product("def","Hương",150000);
        Product pd3 = new Product("ghj","An",40000);
        Product pd4 = new Product("xyz","Đăng",10000);
        productProductManager.add(pd1);
        productProductManager.add(pd2);
        productProductManager.add(pd3);
        productProductManager.add(pd4);

        productProductManager.show();
       

    }
}
