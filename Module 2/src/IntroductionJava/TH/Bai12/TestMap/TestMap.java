package IntroductionJava.TH.Bai12.TestMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main( String[] args ) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Hải",26);
        hashMap.put("Đăng",27);
        hashMap.put("Hùng",25);
        hashMap.put("Hiệp",30);
        System.out.println("Display entry in HashMap: ");
        for (String str:hashMap.keySet()){
            System.out.println("Key: "+str+" Value: "+hashMap.get(str));
        }

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entry in TreeMap (key->>>): ");
        for (String str : treeMap.keySet()){
            System.out.println("Key: "+str+",Value: "+treeMap.get(str));
        }

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Hải",26);
        linkedHashMap.put("Đăng",27);
        linkedHashMap.put("Hùng",25);
        linkedHashMap.put("Hiệp",30);
        System.out.println("Display entry in LinkedHashMap: ");
        for (String str: linkedHashMap.keySet()){
            System.out.println("Key: "+str+",Value: "+linkedHashMap.get(str));
        }


    }
}
