package IntroductionJava.BàiTap.Bai5;

public class Circle {
    private double radius =1.0;
    private String color = "red";

    public Circle(double radius, String idigo, boolean b) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*3.14;
    }
}
