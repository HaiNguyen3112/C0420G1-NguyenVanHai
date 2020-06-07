package IntroductionJava.BàiTap.Bai3;

import java.util.Scanner;

public class AddNeww {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int number, add_index;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Number: ");
        number = sc.nextInt();
        System.out.printf("Enter the index: ");
        add_index = sc.nextInt();

        int [] temparr = new int[arr.length+1];
        for (int i =0;i<add_index;i++){
            temparr[i] = arr[i];
        }
        temparr[add_index] = number;

        for (int i = add_index+1; i<temparr.length;i++){
            temparr[i] = arr[i-1];
        }

        arr = temparr;

        for (int i = 0;i<arr.length;i++){
            System.out.printf(arr[i]+"\t");
        }
    }
}
