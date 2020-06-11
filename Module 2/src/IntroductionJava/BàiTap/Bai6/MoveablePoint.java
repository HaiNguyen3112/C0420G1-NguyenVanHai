package IntroductionJava.BàiTap.Bai6;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float x, float y){
        this.xSpeed = x;
        this.ySpeed = y;
    }
    public float [] getSpeed(){
        float [] temp = new float[2];
        temp[0] = getxSpeed();
        temp[1] = getySpeed();
        return temp;
    }
    public String toString(){
        return "MoveablePoint has point("+super.getX()+","+super.getY()+")"+",speed = ("+getxSpeed()+","+getySpeed()+")";
    }
    public MoveablePoint move(){
        super.setX(super.getX()+getxSpeed());
        super.setY(super.getY()+getySpeed());
        return this;
    }
}

class TestMoveablePoint{
    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint(20f,30f,5f,6f);
        System.out.println("Khởi tạo: "+point.toString());
        for (int i =0;i<5;i++){
            point = point.move();
            System.out.println("Lần "+(i+1)+": "+point.toString());
        }
    }
}
