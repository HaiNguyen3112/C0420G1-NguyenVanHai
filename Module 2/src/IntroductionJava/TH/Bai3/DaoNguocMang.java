package IntroductionJava.TH.Bai3;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.printf("Enter Size: ");
            size = sc.nextInt();
            if (size >20){
                System.out.println("Size  does not over 20");
            }
        }while (size>20);

        int [] arr = new int [size];

        for (int i = 0;i<arr.length;i++){
            arr[i] = (int) Math.round(Math.random()*50);
        }

        System.out.println("Arr before Reverse: ");
        for (int i=0;i<arr.length;i++){
            System.out.printf(arr[i] +" ");
        }

        for (int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        System.out.println("\nArr after Reverse: ");
        for (int i=0;i<arr.length;i++){
            System.out.printf(arr[i] +" ");
        }
    }
}
