package en.codegym.task.pro.task06.task0605;

/* 
Correct order
*/

public class Solution {

    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] array = {0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int lastIndex = array.length - 1;
        boolean isEvenArray = array.length % 2 == 0;
        int stopIndex = (isEvenArray) ? array.length / 2 - 1 : array.length / 2;
        for (int lowIndex = 0; lowIndex <= stopIndex; lowIndex++) {
            int highIndex = lastIndex - lowIndex;
            int lowValue = array[lowIndex];
            int highValue = array[highIndex];
            array[lowIndex] = highValue;
            array[highIndex] = lowValue;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

/*
0, 1, 2, 3, 4, 5
0, 1, 2, 3, 4, 5, 6
for even middle = 6/2 = 3, but actually need 6/2 - 1 = 2
for odd middle = 7/2 = 3, the middle equals itself

for even
we just need to iterate from 0 to half
tmp lowValue = array[lowIndex];
tmp highValue = array[highIndex]
array[lowIndex] = highValue
array[highIndex] = lowValue
*/
