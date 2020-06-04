package IntroductionJava.BàiTap;

import com.sun.org.apache.bcel.internal.classfile.Constant;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        final int RATE = 23000;
        float VND,USD;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter USD ");
        USD = sc.nextFloat();
        VND = USD * RATE;
        System.out.printf("VND: %1.2f",VND);
    }
}
