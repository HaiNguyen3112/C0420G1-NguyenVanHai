package IntroductionJava.BàiTap.Bai3;

import java.util.Scanner;

public class SoLanLap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.printf("Enter the String: ");
        str = sc.nextLine();
        System.out.printf("Enter the chart: ");
        String c = sc.nextLine();

        int count =0;
        for (int i= 0;i<str.length();i++){
            if (c.equals(str.charAt(i))){
                count ++;
            }
        }

        System.out.printf("Số lần lặp của %s là %d",c,count);
    }
}
