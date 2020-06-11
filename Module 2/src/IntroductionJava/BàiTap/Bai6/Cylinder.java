package IntroductionJava.BàiTap.Bai6;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getTheTich(){
        return getHeight()*super.getArea();
    }
    public String toString(){
        return super.toString() + " has height = "+getHeight()+" and the tich = "+getTheTich();
    }
}

class TestCylinder{
    public static void main(String[] args) {
        Cylinder a = new Cylinder(3.5,"heo",6.0);
        System.out.println(a.toString());
    }


}
