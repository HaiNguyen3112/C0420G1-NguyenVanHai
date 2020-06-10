package IntroductionJava.BàiTap.Bai4;

public class MyClass {
    static public int X = 2;
    private int b;

    public int getB(){
        return b;
    }

    public void setB(int b){
        this.b = b;
    }

    static {
        X = 1;
    }

    static public void method() {
        X = 5;
    }

    public static void main(String[] args) {
        MyClass o = new MyClass();
        MyClass.method();
        MyClass.X = 10;
        System.out.printf("x=%d, y=%d", o.X, MyClass.X);
        MyClass a = new MyClass();
        a.X = 15;
        System.out.println("\noX: "+o.X);
        o.setB(1);
        System.out.println(a.getB());
    }
}
