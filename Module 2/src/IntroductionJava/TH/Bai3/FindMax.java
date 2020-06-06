package IntroductionJava.TH.Bai3;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of Arr");
        size = sc.nextInt();

        int [] arr = new int[size];

        for (int i= 0;i<arr.length;i++){
            arr[i]= (int) Math.round(Math.random()*50);
        }

        System.out.println("Arr: ");
        for (int i=0;i <arr.length;i++){
            System.out.printf(arr[i]+" ");
        }

        int max = arr[0];
        int index = 0;
        for (int i = 1; i<arr.length;i++){
            if (max < arr[i]){
                max = arr[i];
                index = i+1;
            }
        }

        System.out.printf("\nMax in Arr is %d, at position %d",max,index);
    }
}
