package IntroductionJava.TH.Bai4;

import java.util.Scanner;

public class Rectangle {
    double width, height;
    public Rectangle(){

    }
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }
    public String disPlay(){
        return "Rectangle  has width: "+this.width+ " and height: "+this.height;
    }

};
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width,height;
        System.out.printf("Enter the width: ");
        width = sc.nextFloat();
        System.out.printf("Enter the height: ");
        height = sc.nextFloat();

        Rectangle rec = new Rectangle(width,height);

        System.out.println(rec.disPlay());
        System.out.println("Area is: "+rec.getArea());
        System.out.println("Perimeter is: "+rec.getPerimeter());

    }
}


