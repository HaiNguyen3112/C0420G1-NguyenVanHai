package IntroductionJava.TH.Bai15;

import java.util.Scanner;

public class CalculationExample {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int x = sc.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int y = sc.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);
    }
    private void calculate(int x, int y){
        try{
            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            System.out.println("Tổng: "+a);
            System.out.println("Hiệu: "+b);
            System.out.println("Tích: "+c);
            System.out.println("Thương: "+d);
        } catch (Exception e){
            System.err.println("Xảy ra ngoại lệ: "+e.getMessage());
        }
    }
}
