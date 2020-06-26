package IntroductionJava.TH.Bai15.ArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class Test {
    public static void main( String[] args ) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatRandom();

        System.out.println("Nhập chỉ số của 1 phần tử: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        try{
            System.out.println("Giá trị của phần tử "+x+" là: "+arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn phần tử của mảng!!!");
        }
    }

}
