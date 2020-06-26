package IntroductionJava.BàiTap.Bai15;

import java.util.Scanner;

public class TriangleTest {
    public static void main( String[] args ) throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Nhập cạnh thứ nhất: ");
            double a = sc.nextDouble();
            System.out.println("Nhập cạnh thứ hai: ");
            double b = sc.nextDouble();
            System.out.println("Nhập cạnh thứ ba: ");
            double c = sc.nextDouble();
            if (a<0 || b < 0 || c<0 || a+b<c || a+c<b || b+c<a){
                throw new IllegalTriangleException("Wrong input");
            }
            Triangle triangle = new Triangle(a,b,c);
            System.out.println(triangle.toString());

        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Wrong typeInput");
        }
    }

}
