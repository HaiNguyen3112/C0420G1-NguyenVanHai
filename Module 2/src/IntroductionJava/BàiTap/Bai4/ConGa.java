package IntroductionJava.BàiTap.Bai4;

public class ConGa extends DongVat{
    private String chieuCao;

    public ConGa(String chieuCao, String mauda){
        super(mauda);
        this.chieuCao = chieuCao;
    }

    public ConGa(){

    }

    @Override
    public String say() {
        return "ooooo";
    }

    @Override
    public String toString(){
        return super.toString() +" la con ga";
    }

    public static void main(String[] args) {
        ConGa conGa = new ConGa("15","mau xanh");
    }

    @Override
    public String hanhDong() {
        return null;
    }
}
