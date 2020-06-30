package IntroductionJava.TH.Bai19_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }


    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email:");
        String str = sc.nextLine();
//        String temp ="a@gmail.com";
//        System.out.println(emailExample.validate(temp));
        EmailExample emailExample = new EmailExample();
        System.out.println(emailExample.validate(str));

    }
}
