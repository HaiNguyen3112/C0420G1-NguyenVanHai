package IntroductionJava.BàiTap.Bai7.InterfaceColorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(6.5,7.0);
        shapes[1] = new Rectangle(9.5,5.0);
        shapes[2] = new Square(5.5);

        for (Shape shape : shapes){
            if (shape instanceof Square){
                Square square = (Square) shape;
                System.out.println(shape);
                square.howToColor();
            } else {
                System.out.println(shape);
            }

        }
    }
}
