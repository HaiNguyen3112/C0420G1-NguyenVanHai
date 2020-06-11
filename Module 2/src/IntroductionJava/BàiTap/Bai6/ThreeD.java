package IntroductionJava.BàiTap.Bai6;

public class ThreeD extends TwoD {
    private float z = 0.0f;

    public ThreeD(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public ThreeD() {
    }
    public ThreeD(float z){
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
      float[] temp =  super.getXY();
      temp[temp.length] = getZ();
      return temp;
    }
    public String toString(){
        return super.toString()+","+getZ()+")";
    }
}

class test3D{
    public static void main(String[] args) {
        ThreeD d = new ThreeD(5.0666f,6.333f,9.8485f);
        System.out.println(d.toString());
    }
}
