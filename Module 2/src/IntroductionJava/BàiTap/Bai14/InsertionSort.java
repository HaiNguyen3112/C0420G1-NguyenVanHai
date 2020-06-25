package IntroductionJava.BàiTap.Bai14;

public class InsertionSort {
    static int[] list = {5,4,12,8,10,23,86,47,1,66,42};
    public static void insertionSort(int[] list){
        for (int i =1;i<list.length;i++){
            int currentIndex = list[i];
            int k;
            for (k = i-1;k>=0 && list[k]>currentIndex;k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentIndex;
        }
    }

    public static void main( String[] args ) {
        insertionSort(list);
        for (int i =0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}
