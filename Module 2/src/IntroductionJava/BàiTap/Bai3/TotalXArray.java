package IntroductionJava.BàiTap.Bai3;

import java.util.Scanner;

public class TotalXArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Row: ");
        int row = sc.nextInt();
        System.out.printf("Enter the Colum: ");
        int col = sc.nextInt();

        int [][] arr = new int[row][col];

        for (int i = 0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                arr[i][j] = (int) Math.round(Math.random()*10+1);
            }
        }

        System.out.println("Matrix: ");

        for (int i=0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                System.out.printf(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }

        int total = 0;
        for (int i = 0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                if (j == i || (j+i == arr.length -1)){
                    total += arr[i][j];
                }
            }
        }
        System.out.printf("Total X of Array is: %d",total);
    }
}
