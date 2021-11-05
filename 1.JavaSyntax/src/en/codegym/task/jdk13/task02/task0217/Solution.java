package en.codegym.task.jdk13.task02.task0217;

/* 
Minimum of four numbers
*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        int aAndBMinimum = min(a, b);
        int cAndDMinimum = min(c, d);

        return min(aAndBMinimum, cAndDMinimum);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -50, 40));
    }
}
