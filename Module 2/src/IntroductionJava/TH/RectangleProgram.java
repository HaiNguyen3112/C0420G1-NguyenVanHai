package IntroductionJava.TH;

import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float height, width;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chiều cao: ");
        height = scanner.nextFloat();

        System.out.println("Nhập vào chiều rộng: ");
        width = scanner.nextFloat();

        float area = height * width;
        System.out.println("Area là: "+area);
    }
}
