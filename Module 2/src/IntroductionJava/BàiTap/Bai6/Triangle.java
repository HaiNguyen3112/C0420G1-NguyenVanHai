package IntroductionJava.BàiTap.Bai6;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimater(){
        return getSide1()+getSide2()+getSide3();
    }
    public double getArea(){
        double temp = getPerimater()/2;
        double temp2 = (temp*(temp-getSide1())*(temp-getSide2())*(temp-getSide3()));
        temp = Math.pow(temp2, 0.5);
        return temp;
    }
    public String toString(){
        return super.toString()+" Triangle has"
                                +"\n side1: "+getSide1()
                                +"\n side2: "+getSide2()
                                +"\n side3: "+getSide3()
                                +"\n Perimeter: "+getPerimater()
                                +"\n Area: "+getArea();
    }
}

class TestTriangle{
    public static void main(String[] args) {
        Triangle tri = new Triangle("blue",true,5.0,8.0,10.0);
        System.out.println(tri.toString());
    }
}
