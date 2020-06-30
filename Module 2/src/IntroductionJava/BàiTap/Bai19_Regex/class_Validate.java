package IntroductionJava.BàiTap.Bai19_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class_Validate {
    private static final String CLASS_REGEX = "^[C|A|P][0-9]{4}[G|H|I|K|L|M]$";
    public class_Validate(){

    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main( String[] args ) {
        class_Validate temp = new class_Validate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the class's name:");
        String str = sc.nextLine();
        System.out.println(temp.validate(str));
    }
}
