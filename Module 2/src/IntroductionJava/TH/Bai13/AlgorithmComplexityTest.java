package IntroductionJava.TH.Bai13;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();

        int[] frequentChar = new int[255];
        for (int i =0;i<inputString.length();i++){
            int ascii = (int) inputString.charAt(i); // ép kí tự về mã ascii. từ 0-255
            frequentChar[ascii] += 1;
        }

        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
//        int temp = 100;
//        System.out.println(""+(char) temp);
    }
}
