package IntroductionJava.BàiTap.Bai13;

import java.util.Scanner;

public class Optional_BinarySearch {
    public static int searchBinarySearch(int[] list, int left, int right, int num){
        int mid = (left+right)/2;
        if (list[mid] == num){
            return mid;
        }
        if (num < list[mid]){
            return searchBinarySearch(list,left,mid-1,num);
        } else if (num > list[mid]){
            return searchBinarySearch(list,mid+1,right,num);
        }
        return -1;
    }


    public static void main( String[] args ) {
        int[] list = {2,4,7,10,15,17,20,21,24,30};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result;
        result = searchBinarySearch(list,0,list.length,num);
        if (result == -1){
            System.out.println("Không tìm thấy "+num+" trong danh sách!!!");
        } else {
            System.out.println("Tìm thấy "+num+" tại ví trí "+(result+1));
        }
    }
}
