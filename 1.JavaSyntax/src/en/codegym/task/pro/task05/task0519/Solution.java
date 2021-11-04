package en.codegym.task.pro.task05.task0519;

import java.util.Arrays;

/* 
Is anyone there?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 32;

    public static void main(String[] args) {
        int[] copiedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copiedArray);
        if (Arrays.binarySearch(copiedArray, element) >= 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
