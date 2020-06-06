package IntroductionJava.BàiTap.Bai3;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] arr = {5,4,8,9,6,3,7,12,10,11};
        int del_index = -1;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Number: ");
        number = sc.nextInt();

        for (int i = 0;i<arr.length; i++){
            if (number == arr[i]){
                del_index = i;
                break;
            }
        }
        if (del_index == -1) {
            System.out.printf("Not found!!!");
        } else {

            for (int i =del_index;i<arr.length-1;i++){
                arr[i] = arr[i+1];
            }

        }

        for (int i = 0;i<arr.length-1;i++){
            System.out.printf(arr[i]+ "\t");
        }

    }
}
