package IntroductionJava.TH.Bai19_Regex.Validate_accout;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account_Example {
    private static final String ACCOUNT_REGEX = "^[a-z0-9_]{6,}$";

    public Account_Example() {
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main( String[] args ) {
        Account_Example account_example = new Account_Example();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Acc: ");
        String str = sc.nextLine();
        System.out.println(account_example.validate(str));
    }
}
