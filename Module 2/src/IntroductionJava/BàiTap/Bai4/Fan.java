package IntroductionJava.BàiTap.Bai4;


public class Fan {
    final int SLOW  = 1;
    final int MEDIUM  = 2;
    final int FAST  = 3;
    private int speed;
    private boolean on;
    private int radius;
    private String color;
    public Fan(){
        this.speed = SLOW;
        this.on = false;
        this.radius  =5;
        this.color = "blue";
    }
    public Fan(int speed, boolean on, int radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public boolean isOn() {
        return on;
    }

    public String toString(){
        if (this.on){
            return "Speed: "+this.speed+" Color: "+this.color+" Radius: "+this.radius+" Fan is on";
        } else return "Speed: "+this.speed+" Color: "+this.color+" Radius: "+this.radius+" Fan is off";
    }

    public static String abc(){
        return "abc";
    }

    public String dspABC() {
        return ABC;
    }

    public static String ABC ="hello";

    public static void main(String[] args) {

        Fan a = new Fan(3,true,10,"yellow");
        Fan b = new Fan(2,false,5,"blue");
        System.out.println(Fan.abc());
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
