import javax.swing.*;
import java.util.Scanner;
import java.util.Arrays;

public class DivideDigitsFromLeftToRight {
    public static void divideDigitsFromLeftToRight(String s) {

        int result = Character.getNumericValue(s.charAt(0));
        int divisorIndex = s.length()-1;
        int divident = result;
        for (int i = 1; i<=s.length()-1; i++) {
            int divisor = Character.getNumericValue(s.charAt(divisorIndex));
            if (divisor != 0){
                result = result/divisor;
            }
            System.out.println(divident + "/" + divisor + " = " + result);
            divident = result;
            divisorIndex--;
        }
        System.out.println("Answer = " + result + ";");
    }
    public static String inputStringDivistion(String s) {
        System.out.println("Enter the string to divide left to right:");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        return s;

    }


    public static void main(String[] args){
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