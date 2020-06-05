package IntroductionJava.TH.Bai2;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Number: ");
        int number = sc.nextInt();

        if (number < 2 ){
            System.out.printf(number + " is not a prime!");
        } else {
            Boolean check = true;
            for (int i = 3 ; i<number; i++){
                if (number%i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.printf(number+" is a prime");
            } else {
                System.out.printf(number+" is not a prime!!!");
            }
        }

    }

}
