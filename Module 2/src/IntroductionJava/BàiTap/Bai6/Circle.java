package IntroductionJava.BàiTap.Bai6;

public class Circle {
    private double radius = 1.0;
    private String color = "green";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
    }

    public Circle(double radius, String color, boolean filled) {

    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public String toString(){
        return "A Circle with radius = "+getRadius()+" and color of "+getColor();
    }
}
class TestCircle{
    public static void main(String[] args) {
        Circle c = new Circle(2.0,"red");
        System.out.println(c.toString());
    }
}
