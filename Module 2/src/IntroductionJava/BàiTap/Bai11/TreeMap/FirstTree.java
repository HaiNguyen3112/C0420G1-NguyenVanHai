package IntroductionJava.BàiTap.Bai11.TreeMap;
import java.util.TreeMap;

public class FirstTree {
    public static void main( String[] args ) {
        TreeMap<Character,Integer> treeMap = new TreeMap<>();
        String s = "today is a beautiful day";
        char[] s2 = s.toCharArray();
        for (int i =0;i<s2.length;i++){
            System.out.println(s2[i]);
        }
    }
}
