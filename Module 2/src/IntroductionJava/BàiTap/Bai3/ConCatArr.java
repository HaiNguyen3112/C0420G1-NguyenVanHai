package IntroductionJava.BàiTap.Bai3;

import java.util.Scanner;

public class ConCatArr {
    public static void main(String[] args) {
        int [] arr1 = new int[10];
        int [] arr2 = new int[5];
        int [] arr = new int[arr1.length+arr2.length];


        for (int i = 0;i<arr1.length;i++){
            arr1[i] = (int) Math.round(Math.random()*10);
        }
        for (int i = 0;i<arr2.length;i++){
            arr2[i] = (int) Math.round(Math.random()*10+10);
        }


        for (int i = 0; i<arr1.length;i++){
            System.out.printf(arr1[i]+ "\t");
        }
        System.out.println("\n");
        for (int i = 0; i<arr2.length;i++){
            System.out.printf(arr2[i]+ "\t");
        }
        System.out.println("\n");



        for (int i =0;i<arr1.length;i++){
            arr[i] = arr1[i];
        }
        for (int i =0;i<arr2.length;i++){
            arr[arr1.length+i] = arr2[i];
        }


        for (int i = 0; i<arr.length;i++){
            System.out.printf(arr[i]+ "\t");
        }
    }
}
