package IntroductionJava.TH.Bai3;

import java.util.Scanner;

public class FindInArray {
    public static void main(String[] args) {
        int index = 0;
        boolean check = false;
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        String input_name = "";
        System.out.printf("Enter name you want to find ");
        input_name = sc.nextLine();

        for (int i =0;i<students.length;i++){
            if (students[i].equals(input_name)){
                index = i;
                check = true;
                break;
            }
        }
        if (check){
            System.out.printf("Name %s be found at position %d",input_name,index+1);
        } else System.out.printf("Not found!!!");
    }
}
