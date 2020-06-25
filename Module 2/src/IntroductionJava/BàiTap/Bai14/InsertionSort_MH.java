package IntroductionJava.BàiTap.Bai14;

public class InsertionSort_MH {
    static int[] list = {5,4,12,8,10,23,86,47,1,66,42};
    public static void insertionSort(int[] list){
        for (int i =1;i<list.length;i++){
            int currentIndex = list[i];
            System.out.println("Giá trị hiện tại cần tìm chỗ là: "+currentIndex);
            int k;
            System.out.println("Chạy vòng for để so ("+currentIndex+")"+"với mảng từ "+(i-1)+" về đầu mảng");
            System.out.println("Mảng bên trái số cần xếp là: ");
            for (int j=0;j<=i-1;j++){
                System.out.printf(list[j]+"\t");
            }
            System.out.println("");
            for (k = i-1;k>=0 && list[k]>currentIndex;k--){
                list[k+1] = list[k];
                System.out.println("Gán giá trị phía trước lớn hơn cho phần tử phía sau");
            }
            list[k+1] = currentIndex;
            System.out.println("Gán lại giá trị cho vị trí mà nó cần đứng");
        }
    }

    public static void main( String[] args ) {
        insertionSort(list);
        for (int i =0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}
