package IntroductionJava.BàiTap.Bai11.TreeMap;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapp {
    public static void main( String[] args ) {
        java.util.TreeMap<String, Integer> treeMap = new java.util.TreeMap<>();
        Scanner sc = new Scanner(System.in);
        String s = "today is a beautiful day";
        String[] s2 = s.split("");
        for (int i =0;i<s2.length;i++){
            String temp = s2[i].toUpperCase();
            boolean check = false;
            if (!temp.equals(" ")){
                for (String tempKey : treeMap.keySet()){
                    if (temp.equals(tempKey)){
                        // lay ra va thay doi gia tri value.
                        Integer a = treeMap.get(tempKey);
                        a = a+1;
                        treeMap.put(tempKey, a);

                        check = true;
                    }
                }
                if (!check){
                    treeMap.put(temp,1);
                }

            }
        }
        for (String tempKey : treeMap.keySet()){
            System.out.println("Word: "+tempKey+": "+treeMap.get(tempKey));
        }
    }
}
