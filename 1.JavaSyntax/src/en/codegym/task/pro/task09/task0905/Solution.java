package en.codegym.task.pro.task09.task0905;

/* 
Octal converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 128;
        System.out.println("Decimal number " + decimalNumber + " is equal to octal number " + toOctal(decimalNumber));
        int octalNumber = 200;
        System.out.println("Octal number " + octalNumber + " is equal to decimal number " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber <= 0) return 0;
        int quotient = decimalNumber, remainder = 1, octalNumber = 0, exponent = 0;
        while (quotient != 0) {
            remainder = quotient % 8;
            octalNumber += remainder*Math.pow(10, exponent);
            quotient = quotient / 8;
            exponent += 1;
        }
        return octalNumber;
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber <= 0) return 0;
        int quotient = octalNumber, remainder = 1, decimalNumber = 0, exponent = 0;
        while (quotient != 0) {
            remainder = quotient % 10;
            decimalNumber += remainder*Math.pow(8, exponent);
            quotient = quotient / 10;
            exponent += 1;
        }
        return decimalNumber;
    }
}
/*
toOctal
156 in Decimal is 234 in Octal
quotient = 156
remainder = 156 % 8 = 4
octal = 4*Math.power(10, 0) = 4;
quotient = 156 / 8 = 19;
remainder = 19 % 8 = 3
octal = 4 + 3*Math.pow(10, 1) = 4 + 3*10 = 34
quotient = 19 / 8 = 2
remainder = 2 % 8 = 2
octal = 34 + 2*Math.pow(10, 2) = 34 + 200 = 234
quotient = 2 / 8 = 0;


toDecimal
234 in Octal is 156 in Decimal
quotient = 234
remainder = 234 % 10 = 4
decimal = 4*Math.pow(8, 0) = 4
quotient = 234 / 10 = 23
remainder = 23 % 10 = 3
decimal = 4 + 3*Math.pow(8, 1) = 4 + 24 = 28;
quotient = 23 / 10 = 2;
remainder = 2 % 10 = 2;
decimal = 28 + 2*Math.pow(8, 2) = 28 + 2*64 = 28 + 128 = 156;
*/