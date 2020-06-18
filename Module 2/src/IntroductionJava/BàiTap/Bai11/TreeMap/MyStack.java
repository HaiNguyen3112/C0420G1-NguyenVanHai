package IntroductionJava.BàiTap.Bai11.TreeMap;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        int decimalNumber;
        String binaryNumber, hexadecimalNumber;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Input decimal number:");
        decimalNumber= Integer.parseInt(scanner.nextLine());


        System.out.println("Output binary number:");
        binaryNumber = convertDeciamalTo(decimalNumber,2);
        System.out.println(binaryNumber);

        System.out.println("Input binary number:");
        binaryNumber=scanner.nextLine();

        System.out.println("Output decimal number:");
        decimalNumber= convertToDecimal(binaryNumber,2);
        System.out.println(decimalNumber);

        System.out.println("Input decimal number:");
        decimalNumber= Integer.parseInt(scanner.nextLine());


        System.out.println("Output hexadecimal number:");
        hexadecimalNumber = convertDeciamalTo(decimalNumber,16);
        System.out.println(hexadecimalNumber);

        System.out.println("Input hexadecimal number:");
        hexadecimalNumber=scanner.nextLine();

        System.out.println("Output decimal number:");
        decimalNumber= convertToDecimal(hexadecimalNumber,16);
        System.out.println(decimalNumber);
    }

    /*  Đổi ra số thập phân  */
    /*  Đổi chữ cái thành số  */
    private static String convertCharacterToNumber(String character) {
        String numberConvert = character;
        switch (character) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                break;
            case "A":
                numberConvert = "10";
                break;
            case "B":
                numberConvert = "11";
                break;
            case "C":
                numberConvert = "12";
                break;
            case "D":
                numberConvert = "13";
                break;
            case "E":
                numberConvert = "14";
                break;
            case "F":
                numberConvert = "15";
                break;
        }
        return numberConvert;
    }
    /*  Đổi số có chữ cái thành 1 stack, có phần tử có chữ cái  */
    private static Stack<String> convertToStack(String numberConvert) {
        Stack<String> stack = new Stack<>();
        for (int i = 0, j = numberConvert.length() - 1; i < numberConvert.length(); i++, j--) {
            stack.push(numberConvert.substring(i, i + 1));
        }
        return stack;
    }
    /*  Đổi 1 stack có phần tử có chữ cái sang 1 stack có phần tử đều là số   */
    private static Stack<String> convertToStackNumber(String numberConvert) {
        Stack<String> stack = convertToStack(numberConvert);
        for (int i = 0; i < stack.size(); i++) {
            stack.set(i, convertCharacterToNumber(stack.elementAt(i)));
        }
        return stack;
    }
    /*  Đổi thành số thập phân  */
    private static int convertToDecimal(String numberConvert, int numeralSystem) {
        int decimalNumber = 0;
        Stack<String> stack = convertToStackNumber(numberConvert);
        for (int i = 0, j = stack.size() - 1; i < stack.size(); i++, j--) {
            decimalNumber += (int) (Integer.parseInt(stack.elementAt(i)) * Math.pow(numeralSystem, j));
        }
        return decimalNumber;
    }

    /*  Đổi từ số thập phân sang số có chữ cái  */
    /*  Đổi số sang chữ cái  */
    private static String convertNumberToCharacter(String number) {
        String numberConvert = number;
        switch (number) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                break;
            case "10":
                numberConvert = "A";
                break;
            case "11":
                numberConvert = "B";
                break;
            case "12":
                numberConvert = "C";
                break;
            case "13":
                numberConvert = "D";
                break;
            case "14":
                numberConvert = "E";
                break;
            case "15":
                numberConvert = "F";
                break;
        }
        return numberConvert;
    }
    /*  Đổi số thập phân thành 1 stack có phần tử đều là số  */
    private static Stack<String> convertDecimalToStackNumber(Integer decimalNumber, int numeralSystem) {
        Stack<String> stack = new Stack<>();
        do {
            int element = decimalNumber % numeralSystem;
            stack.push(Integer.toString(element));
            decimalNumber = (int) Math.floor(decimalNumber / numeralSystem);
        } while (!(decimalNumber < numeralSystem));
        stack.push(Integer.toString(decimalNumber));
        return stack;
    }
    /*  Đổi 1 stack phần tử đều là chữ số sang 1 stack có phần tử là chữ cái  */
    private static Stack<String> convertToStackCharacter(Integer decimalNumber, int numeralSystem) {
        Stack<String> stack = convertDecimalToStackNumber(decimalNumber, numeralSystem);
        for (int i=0;i<stack.size();i++){
            stack.set(i,convertNumberToCharacter(stack.elementAt(i)));
        }
        return stack;
    }
    /*  Đổi sang số có chữ cái  */
    private static String convertDeciamalTo(Integer decimalNumber, int numeralSystem){
        String numberConvert="";
        Stack<String> stack = convertToStackCharacter(decimalNumber,numeralSystem);
        for (int i=0;i<stack.size();i++){
            numberConvert+=stack.elementAt(stack.size()-1-i);
        }
        return numberConvert;
    }
}
