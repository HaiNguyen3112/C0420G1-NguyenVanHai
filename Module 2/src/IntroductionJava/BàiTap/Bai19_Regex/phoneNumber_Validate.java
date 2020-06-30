package IntroductionJava.BàiTap.Bai19_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phoneNumber_Validate {
    private static final String CODE = "^[0-9]{2}$";
    private static final String PHONE_NUMBER = "^0[0-9]{9}$";

    public phoneNumber_Validate() {
    }
    public boolean validate(String regexCode, String regexNumber){
        Pattern patternCode = Pattern.compile(CODE);
        Pattern patternNumber = Pattern.compile(PHONE_NUMBER);
        Matcher matcherCode = patternCode.matcher(regexCode);
        Matcher matcherNumber = patternNumber.matcher(regexNumber);
        return (matcherCode.matches() && matcherNumber.matches());
    }

    public static void main( String[] args ) {
        phoneNumber_Validate pv = new phoneNumber_Validate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code: ");
        String str1 = sc.nextLine();
        System.out.println("Enter number: ");
        String str2 = sc.nextLine();
        System.out.println(pv.validate(str1,str2));
    }
}
