package IntroductionJava.BàiTap.Bai6;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float [] temp = new float[2];
        temp[0] = getX();
        temp[1] = getY();
        return temp;
    }
    public String toString(){
        return "Point2D has ("+getX()+", "+getY()+")";
    }
}
class TestPoint{
    public static void main(String[] args) {
        Point temp = new Point(5.666f,4.33223f);
        System.out.println(temp.toString());
    }
}
