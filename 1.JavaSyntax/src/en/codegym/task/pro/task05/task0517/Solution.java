package en.codegym.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Splitting an array
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public static void main(String[] args) {
        int[] firstHalf = new int[array.length];
        int[] secondHalf = new int[array.length];
        if (array.length % 2 == 0) {
            int center = (array.length / 2);
            firstHalf = Arrays.copyOfRange(array, 0, center);
            secondHalf = Arrays.copyOfRange(array, center, array.length);
        } else {
            int middle = (array.length / 2) + 1;
            firstHalf = Arrays.copyOfRange(array, 0, middle);
            secondHalf = Arrays.copyOfRange(array, middle, array.length);
        }
        //write your code here
        result[0] = new int[firstHalf.length];
        result[1] = new int[secondHalf.length];
        for (int index = 0; index < firstHalf.length; index++) {
            result[0][index] = firstHalf[index];
        }
        for (int index = 0; index < secondHalf.length; index++) {
            result[1][index] = secondHalf[index];
        }
        System.out.println(Arrays.deepToString(result));
    }
}
/*
Algorithm:
1.  if the array is even then we have an evenly balanced 2D array
    1.  get the length of the original array
    2.  center = (array.length) / 2;
    3.  firstHalf = Arrays.copyOfRange(array, 0, center)
    4.  secondHalf = Arrays.copyOfRand(array, center, array.length)
    5.  result[0] = firstHalf
    6.  result[1] = secondHalf
*/
