package IntroductionJava.BàiTap.Bai2;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int choice =1, choice2;
        Scanner sc = new Scanner(System.in);
        while (choice !=4){
            System.out.println("Menu " +
                    "\n1. Print the rectangle" +
                    "\n2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)" +
                    "\n3. Print isosceles triangle" +
                    "\n4. Exit");
            choice = sc.nextInt();


            switch (choice){
                case 1:
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    break;
                case 2: {
                    System.out.println("1. Bottom-Left" +
                            "\n2. Top-Left" +
                            "\n3. Top-Right" +
                            "\n4. Bottom-Right");
                    choice2 = sc.nextInt();
                    switch (choice2){
                        case 1: {
                            for (int i =1; i<=5;i++){
                                for (int j = 1;j<=i;j++){
                                    System.out.printf("*");
                                }
                                System.out.printf("\n");
                            }
                            break;
                        }
                        case 2:{
                            for (int i= 5; i >=1;i--){
                                for (int j = 1;j<=i;j++){
                                    System.out.printf("*");
                                }
                                System.out.printf("\n");
                            }
                            break;
                        }
                        case 3:{
                            for (int i =5;i>=1;i--){
                                for (int j =1;j>=i && j <6;j++){
                                    if (j >= i){
                                        System.out.printf("*");
                                    } else System.out.printf("");
                                }
                                System.out.printf("\n");
                            }
                            break;
                        }
                    }
                }
                case 3:{
                    for(int i=1;i<=5;i++) {
                        for (int j = 1; j <= 5 - i; j++)
                            System.out.printf(" ");
                        for (int j = 1; j <= 2 * i - 1; j++)
                            System.out.printf("*");
                        System.out.printf("\n");
                    }
                    break;
                }
                case 4: System.exit(0);
            }
        }
        }

    }
