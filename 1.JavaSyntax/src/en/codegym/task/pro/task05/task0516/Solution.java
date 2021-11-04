package en.codegym.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Filling an array
*/

public class Solution {

//    public static int[] array = new int[20];
    public static int[] array = new int[21];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int arrayLength = array.length;
        if (array.length % 2 == 0) {
            int middle = (arrayLength / 2);
            Arrays.fill(array, 0, middle, valueStart);
            Arrays.fill(array, middle, arrayLength, valueEnd);
        } else {
            int center = (arrayLength/2) + 1;
            Arrays.fill(array, 0, center, valueStart);
            Arrays.fill(array, center, arrayLength, valueEnd);
        }
        System.out.println(Arrays.toString(array));
    }
}
