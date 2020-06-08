package IntroductionJava.BàiTap.Bai4;

import com.sun.deploy.ui.AboutDialog;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        return (2*this.b - 4*this.a*this.c);
    }
    public double getRoot1(){

        return ((-b)+Math.pow(b*b -4*a*c,0.5))/2*a;
    }
    public double getRoot2(){

        return ((-b)-Math.pow(b*b -4*a*c,0.5))/2*a;
    }

    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a: ");
        a = sc.nextInt();
        System.out.printf("Enter b: ");
        b = sc.nextInt();
        System.out.printf("Enter c: ");
        c = sc.nextInt();

        QuadraticEquation qua = new QuadraticEquation(a,b,c);

        double delta = qua.getDiscriminant();
        if (delta>0){
            System.out.println("Root 1: "+qua.getRoot1());
            System.out.println("Root 2: "+qua.getRoot2());
        }
        if (delta == 0){
            System.out.println("Root: "+qua.getRoot1());
        }
        if (delta <0){
            System.out.println("The equation has no roots");
        }
    }

}
