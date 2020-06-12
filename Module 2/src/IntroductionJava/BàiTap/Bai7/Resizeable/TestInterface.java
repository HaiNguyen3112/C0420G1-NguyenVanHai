package IntroductionJava.BàiTap.Bai7.Resizeable;

public class TestInterface {
    public static void main(String[] args) {
//
//        //Test Circle Interface
//        Circle circle = new Circle(5.0);
//        System.out.println("Before resize: "+circle.getRadius());
//        circle.resize(50);
//        System.out.println("After resize: "+circle.getRadius());
//
//
//        //Test Rectangle Interface
//        Rectangle rec = new Rectangle(5.5,4.5);
//        System.out.println("Before resize: \nLenght: "+rec.getLength()
//                            +"\nWidth: "+rec.getWidth());
//        rec.resize(50);
//        System.out.println("After resize: \nLenght: "+rec.getLength()
//                +"\nWidth: "+rec.getWidth());
//
//        //Test Square Interface
//        Square qua = new Square(5);
//        System.out.println("Before resize: "+qua.getSide());
//        qua.resize(50);
//        System.out.println("After resie: "+qua.getSide());


        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(7,4);
        shapes[2] = new Square(6);
        double percent = (double) Math.round(Math.random()*100+1);
        System.out.println("Before Resize: ");

        

        for (Shape shape : shapes){
            if (shape instanceof Circle){
                Circle circle1 = (Circle) shapes[0];
                System.out.println("Circle: "+
                        "\nRadius: "+ circle1.getRadius()
                        +"\nArea: "+circle1.getArea()
                        +"\nPerimrter: "+circle1.getPerimeter());
            }
            if (shape instanceof Square){
                Square square = (Square) shape;
                System.out.println("Square: "
                        +"\nSide: "+square.getSide()
                        +"\nArea: "+square.getArea()
                        +"\nPerimeter: "+square.getPerimeter());
            } else if (shape instanceof Rectangle){
                Rectangle rectangle =(Rectangle) shape;
                System.out.println("Rectangle: "
                                    +"\nLength: "+rectangle.getLength()
                                    +"\nWidth: "+rectangle.getWidth()
                                    +"\nArea: "+rectangle.getArea()
                                    +"\nPerimeter: "+rectangle.getPerimeter());
            }

        }




        for (Shape shape:shapes){
            if (shape instanceof Circle){
                Circle circle1 = (Circle) shapes[0];
                circle1.resize(percent);
            }
            if (shape instanceof Rectangle){
                Rectangle rectangle =(Rectangle) shape;
                rectangle.resize(percent);
            }
            if (shape instanceof Square){
                Square square = (Square) shape;
                square.resize(percent);
            }
        }





        System.out.println("After resize with percent: "+percent);
        for (Shape shape : shapes){
            if (shape instanceof Circle){
                Circle circle1 = (Circle) shapes[0];
                System.out.println("Circle: "+
                        "\nRadius: "+ circle1.getRadius()
                        +"\nArea: "+circle1.getArea()
                        +"\nPerimrter: "+circle1.getPerimeter());
            }
            if (shape instanceof Square){
                Square square = (Square) shape;
                System.out.println("Square: "
                        +"\nSide: "+square.getSide()
                        +"\nArea: "+square.getArea()
                        +"\nPerimeter: "+square.getPerimeter());
            } else if (shape instanceof Rectangle){
                Rectangle rectangle =(Rectangle) shape;
                System.out.println("Rectangle: "
                        +"\nLength: "+rectangle.getLength()
                        +"\nWidth: "+rectangle.getWidth()
                        +"\nArea: "+rectangle.getArea()
                        +"\nPerimeter: "+rectangle.getPerimeter());
            }

        }

    }
}
