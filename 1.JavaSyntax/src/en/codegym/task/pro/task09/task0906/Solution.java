package en.codegym.task.pro.task09.task0906;

/* 
Binary converter
*/

public class Solution {
    public static void main(String[] args) {
//        int decimalNumber = Integer.MAX_VALUE;
//        int decimalNumber = 56874;
//        int decimalNumber = 21627;
//        System.out.println("Decimal number " + decimalNumber + " is equal to binary number " + toBinary(decimalNumber));
//        String binaryNumber = "1111111111111111111111111111111";
//        String binaryNumber = "1101111000101010";
//        String binaryNumber = "101010001111011";
        String binaryNumber = null;
        System.out.println("Binary number " + binaryNumber + " is equal to decimal number " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) return "";
        int quotient = decimalNumber, remainder = 1;
        String binaryNumber = "";
        while (quotient != 0) {
            remainder = quotient % 2;
            binaryNumber = String.valueOf(remainder) + binaryNumber;
            quotient = quotient / 2;
        }
        return binaryNumber;
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty() || binaryNumber.trim().isEmpty()) return 0;
        int exponent = 0, index = binaryNumber.length() - 1, decimalNumber = 0, currentDigit = 0;
        char currentDigitChar = '0';
        while (index >= 0) {
            currentDigitChar = binaryNumber.charAt(index);
            currentDigit = (currentDigitChar == '0') ? 0 : 1;
            currentDigit = (int) (currentDigit * Math.pow(2, exponent));
            decimalNumber += currentDigit;
            exponent += 1;
            index -= 1;
        }
        return decimalNumber;
    }
}
