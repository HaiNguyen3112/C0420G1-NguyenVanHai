package IntroductionJava.BàiTap.Bai2;

public class FirstPrime {
    public static void main(String[] args) {
        int count =0,number =20,i;
        int N=2;
        String text ="";
        while(count<number){
            for (i =2;i<N;i++){
                if (N%i==0){
                    break;
                }
            }
            if (i==N){
                text +=N + " ";
                count++;
            }
            N++;
        }
        System.out.printf("%s",text);

    }
}
