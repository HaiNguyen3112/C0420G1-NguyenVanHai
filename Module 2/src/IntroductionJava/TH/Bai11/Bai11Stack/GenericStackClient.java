package IntroductionJava.TH.Bai11.Bai11Stack;

import static IntroductionJava.TH.Bai11.Bai11Stack.MyGenericStack.stackOfIStrings;
import static IntroductionJava.TH.Bai11.Bai11Stack.MyGenericStack.stackOfIntegers;

public class GenericStackClient{
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
