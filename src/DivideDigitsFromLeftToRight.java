import javax.swing.*;
import java.util.Scanner;

public class DivideDigitsFromLeftToRight {
    public static void divideDigitsFromLeftToRight(String s) {
        int divident = Character.getNumericValue(s.charAt(0));
        int result = 0;
        int divisorIndex = s.length() - 1;
        for (int i = 1; i< s.length(); i++) {
            int divisor = Character.getNumericValue(s.charAt(divisorIndex));
            try {
                if (divisor != 0){
                    result = divident/divisor;
                    System.out.println(divident + "/" + divisor + " = " + result);
                    divident = result;
                }else{
                    throw new ArithmeticException("Division by zero");
            }
            } catch (ArithmeticException e) {
                       System.out.println(divident + "/" + divisor + " = division by zero");
            }
            divisorIndex--;
        }
    }
    public static String inputStringDivistion(String s) {
        System.out.println("Enter the string to divide left to right:");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        if( s.length()<2 && s.length()>100);
            System.out.println("Enter the string to Print its digit," +
                " it's length should be between 2 to 100");
        return s;

    }
    public static void main(String[] args){
        //String s = "8241";
        String s = "";
        s = inputStringDivistion(s);
        divideDigitsFromLeftToRight(s);
    }
}
/*
Create a  method to divide the digits of a given string from left to right.
Strings length is between 2 - 100;EX String s = 824
8 ÷ 2 ÷ 4 = 1
8÷2 = 4
4÷2 =1
Answer = 1;
Post your GitHub link
 */