package IntroductionJava.BàiTap.Bai3;

import org.omg.CORBA.MARSHAL;

import java.util.Scanner;

public class TotalOfColum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Row: ");
        int row = sc.nextInt();
        System.out.printf("Enter the Colum: ");
        int col = sc.nextInt();

        float [][] arr = new float[row][col];

        for (int i = 0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                arr[i][j] = (float) Math.round(Math.random()*20+1);
            }
        }

        System.out.println("Matrix: ");

        for (int i=0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                System.out.printf("%-5f%s",arr[i][j], "\t");
            }
            System.out.println(" ");
        }

        boolean check = false;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Total of Colum: ");
            System.out.println("2. Exit ");

            int choice = sc.nextInt();
            switch (choice){
                case 1: {
                    System.out.printf("Enter the Colum: ");
                    int col_total = sc.nextInt();
                    float total = 0;
                    for (int i = 0;i<arr.length;i++){
                        for (int j =0;j<arr[i].length;j++){
                            if (j==col_total-1){
                                total += arr[i][j];
                            }
                        }
                    }
                    System.out.printf("Total of Colum %d is: %f",col_total,total);
                    break;
                }
                case 2: {
                    check =true;
                    System.exit(0);
                }
            }

        }while (!check);
    }
}
