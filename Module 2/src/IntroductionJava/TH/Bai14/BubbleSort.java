package IntroductionJava.TH.Bai14;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void bubbleSort(int[] list){
        boolean needNextPass = true;
        for (int k =1;k<list.length && needNextPass;k++){
            needNextPass = false;
            for (int i =0;i<list.length-k;i++)
                //tối đa chạy tới vị trí length -2. 0->4, chỉ chạy tới vị trí 3, nếu chạy tới vị trí 4 thì vị trí 5 ko có phần tử => lỗi
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
        }
    }

    public static void main( String[] args ) {
        bubbleSort(list);
        for (int i =0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}
