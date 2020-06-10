package IntroductionJava.BàiTap.Bai4;

public  abstract class DongVat implements HanhDOng{
    private String mauDa;

    public DongVat(String mauDa) {
        this.mauDa = mauDa;
    }

    public DongVat() {

    }

    public abstract String say();

    @Override
    public String toString(){
        return this.mauDa;
    }
}
