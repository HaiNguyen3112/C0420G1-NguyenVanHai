package IntroductionJava.BàiTap.Bai3;

import org.omg.CORBA.MARSHAL;

public class Mang2Chieu {
    public static void main(String[] args) {
        int [][] arr = new int[5][5];

        for (int i=0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                arr[i][j] = (int) Math.round(Math.random()*50+1);
            }
        }

        System.out.println("Matrix: ");

        for (int i=0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                System.out.printf(arr[i][j]+ "\t");
            }
            System.out.println(" ");
        }

        int i_max=0;
        int j_max=0;
        int max = arr[0][0];
        for (int i=0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                if (max<arr[i][j]){
                    max = arr[i][j];
                    i_max = i;
                    j_max = j;
                }
            }
        }
        System.out.printf("Giá trị lớn nhất là: %d tại vị trí (%d,%d)",max,i_max,j_max);
    }
}
