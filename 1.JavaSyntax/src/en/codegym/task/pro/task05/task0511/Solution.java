package en.codegym.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Creating a two-dimensional array
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        multiArray = new int[rows][];
        int index = 0;

        while (index < rows && scanner.hasNext()) {
            int rowCells = scanner.nextInt();
            multiArray[index] = new int[rowCells];
            index += 1;
        }
    }
}
/*
    - the first number entered will initialize the rows of multiArray
    - the problem statement says we will read N + 1 numbers from the keyboard
    - once we read in the first number this sets the limit on how much the
    while loop will run for the next numbers it will run N times.
    - we initialize an index to 0 and for each number read in we set
    multiArray[index] = new int[number read in];
*/
