package IntroductionJava.BàiTap.Bai11.TreeMap;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        String num;
        System.out.print("Enter: ");
        num = sc.nextLine();
        int total =0;
        for (int i =0;i<num.length();i++){
            String temp = num.substring(i,i+1);
        }






        int n = 111;
        Stack<Integer> stack = new Stack<>();
        while (n != 0) {
            stack.push(n % 2);
            n = n / 2;
        }
        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }

    }
}
