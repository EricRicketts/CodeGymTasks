package en.codegym.task.pro.task09.task0907;

/* 
Hexadecimal converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Decimal number " + decimalNumber + " is equal to hexadecimal number " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to decimal number " + toDecimal(hexNumber));

    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0) return "";
        final int hexBase = 16;
        final String[] decimalToHex = {
            "0", "1", "2", "3", "4", "5", "6", "7",
            "8", "9", "a", "b", "c", "d", "e", "f"
        };
        int quotient = decimalNumber, remainderInHex = 0;
        String hexNumber = "", hexDigit = "";
        while (quotient > 0) {
            remainderInHex = quotient % hexBase;
            hexDigit = decimalToHex[remainderInHex];
            hexNumber = hexDigit + hexNumber;
            quotient = quotient / hexBase;
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty() || hexNumber.trim().isEmpty()) return 0;
        final int hexBase = 16;
        final char[] decimalToHex = {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        int decimalDigit = 0, decimalNumber = 0;
        for (int index = hexNumber.length() - 1, exponent = 0; index >= 0; index--) {
            char hexDigit = hexNumber.charAt(index);
            for (int decimalIndex = 0; decimalIndex < decimalToHex.length; decimalIndex++) {
                if (decimalToHex[decimalIndex] == hexDigit) {
                    decimalDigit = decimalIndex;
                    break;
                }
            }
            decimalNumber += decimalDigit*Math.pow(hexBase, exponent);
            exponent += 1;
        }
        return decimalNumber;
    }
}
/*
Decimal to Hexadecimal
while (the decimal number is not 0)

the hexadecimal representation = the character in the HEX string that has an index equal
to the remainder of the decimal number divided by 16
+ the hexadecimal representation of the number

the decimal number = the decimal number / 16


Hexadecimal to Decimal:

for (int i = 0; i < length of the input string; i++) {
the decimal number = 16 * the decimal number +
the index of the character in the HEX string that is equal
to the character in the input string at index i
}
}
*/
