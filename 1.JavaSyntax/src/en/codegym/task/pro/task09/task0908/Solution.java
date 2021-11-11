package en.codegym.task.pro.task09.task0908;

/* 
Binary to hexadecimal converter
*/

public class Solution {
    public static void main(String[] args) {
        String[][] data = new String[][]{
                {null, null}, {"", ""}, {"  ", "  "},
                {"100111010000", "9d0"}, {"0", "0"}, {"1", "1"}, {"10", "2"},
                {"011", "3"}, {"100", "4"}, {"1000", "8"},
                {"10000", "10"}, {"100001011111", "85f"}, {"1001101010111100", "9abc"},
                {"101010111100110111101111", "abcdef"}
        };
        for (String[] binaryHexPair:data) {
            String binaryNumber = binaryHexPair[0];
            String hexNumber = binaryHexPair[1];
            System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
            System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
        }
    }

    public static String toHex(String binaryNumber) {
        final int nibbleBitWidth = 4;
        if (stringIsNullOrEmpty(binaryNumber) || isInvalidBinaryNumber(binaryNumber)) return "";
        String hexNumber = "";
        int numberOfBits = binaryNumber.length();
        binaryNumber = (numberOfBits % nibbleBitWidth == 0) ? binaryNumber :
                "0".repeat(nibbleBitWidth - (numberOfBits % nibbleBitWidth)) + binaryNumber;

        for (int startNibble = 0; startNibble < binaryNumber.length(); startNibble += nibbleBitWidth) {
            int endNibble = startNibble + nibbleBitWidth;
            String nibble = binaryNumber.substring(startNibble, endNibble);
            hexNumber += binaryNibbleToHexDigit(nibble);
        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        if (stringIsNullOrEmpty(hexNumber) || isInvalidHexNumber(hexNumber)) return "";
        String binaryNumber = "";
        for (int index = 0; index < hexNumber.length(); index++) {
            String hexDigit = String.valueOf(hexNumber.charAt(index));
            binaryNumber += hexDigitToBinaryNibble(hexDigit);
        }
        return binaryNumber;
    }

    private static String binaryNibbleToHexDigit(String nibble) {
        final String[][] binaryToHex = {
            {"0000", "0"}, {"0001", "1"}, {"0010", "2"}, {"0011", "3"},
            {"0100", "4"}, {"0101", "5"}, {"0110", "6"}, {"0111", "7"},
            {"1000", "8"}, {"1001", "9"}, {"1010", "a"}, {"1011", "b"},
            {"1100", "c"}, {"1101", "d"}, {"1110", "e"}, {"1111", "f"}
        };

        for (String[] nibbleHexPair:binaryToHex) {
            if (nibble.equals(nibbleHexPair[0])) return nibbleHexPair[1];
        }
        return "";
    }

    private static String hexDigitToBinaryNibble(String hexDigit) {
        final String[][] hexToBinary = {
                {"0", "0000"}, {"1", "0001"}, {"2", "0010"}, {"3", "0011"},
                {"4", "0100"}, {"5", "0101"}, {"6", "0110"}, {"7", "0111"},
                {"8", "1000"}, {"9", "1001"}, {"a", "1010"}, {"b", "1011"},
                {"c", "1100"}, {"d", "1101"}, {"e", "1110"}, {"f", "1111"}
        };
        for (String[] hexNibblePair:hexToBinary) {
            if (hexDigit.equals(hexNibblePair[0])) return hexNibblePair[1];
        }
        return "";
    }

    private static boolean isInvalidBinaryNumber(String binaryNumber) {
        for (int index = 0; index < binaryNumber.length(); index++) {
            char binaryDigit = binaryNumber.charAt(index);
            boolean isNotBinaryDigit = !(binaryDigit == '0' || binaryDigit == '1');
            if (isNotBinaryDigit) return true;
        }
        return false;
    }

    private static boolean isInvalidHexNumber(String hexNumber) {
        int zeroCharInt = '0', nineCharInt = '9', lowerCaseACharInt = 'a', lowerCaseFCharInt = 'f';
        for (int index = 0; index < hexNumber.length(); index++) {
            char hexDigit = hexNumber.charAt(index);
            boolean isZeroOrNine = hexDigit >= zeroCharInt && hexDigit <= nineCharInt;
            boolean isAOrF = hexDigit >= lowerCaseACharInt && hexDigit <= lowerCaseFCharInt;
            boolean isNotHexDigit = !(isZeroOrNine || isAOrF);
            if (isNotHexDigit) return true;
        }
        return false;
    }

    private static boolean stringIsNullOrEmpty(String str) {
        return str == null || str.isEmpty() || str.trim().isEmpty();
    }
}

/*
One algorithm for converting the string representation of a binary number to the string representation of a
hexadecimal number is as follows:

We check the length of the string received in the input parameter. It must be a multiple of 4.
If this is not the case, then add the required number of 0s to the beginning of the string.
We take every four characters (bits) and check which hexadecimal character they correspond to.


One algorithm for converting the string representation of a hexadecimal number to the string representation
of a binary number is as follows:

We take each character and check which binary number (4 bits) it corresponds to.
*/
