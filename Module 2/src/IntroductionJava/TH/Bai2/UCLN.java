package IntroductionJava.TH.Bai2;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        a = sc.nextInt();
        System.out.printf("Enter second number: ");
        b = sc.nextInt();

        if (a==0 || b ==0){
            System.out.printf("Không có UCLN");
        } else {
            int temp_a = Math.abs(a);
            int temp_b = Math.abs(b);

            while (temp_a!=temp_b){
                if (temp_a>temp_b){
                    temp_a=temp_a-temp_b;
                } else {
                    temp_b = temp_b-temp_a;
                }
            }
            System.out.printf("UCLN của %d và %d là: %d",a,b,temp_a);
        }
    }
}
