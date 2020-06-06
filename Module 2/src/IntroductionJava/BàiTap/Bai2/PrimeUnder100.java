package IntroductionJava.BàiTap.Bai2;

public class PrimeUnder100 {
    public static void main(String[] args) {
        int i,j;
        String text ="";
        for (i =2;i<100;i++){
            for (j =2;j<i;j++){
                if (i%j==0){
                    break;
                }
            }
            if (j==i){
                text +=i+" ";
            }
        }
        System.out.printf("%s",text);
    }

}

