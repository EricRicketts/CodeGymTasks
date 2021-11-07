package en.codegym.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Favorite board games
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        chess.name = "Battleship";
        collection[0] = chess;

        BoardGame go = new BoardGame();
        go.name = "Foo";
        collection[1] = go;

        BoardGame scrabble = new BoardGame();
        scrabble.name = "Bar";
        collection[2] = scrabble;

        BoardGame checkers = new BoardGame();
        checkers.name = "Fizz";
        collection[3] = checkers;

        BoardGame mastermind = new BoardGame();
        mastermind.name = "Buzz";
        collection[4] = mastermind;

        System.out.println(Arrays.toString(collection));
    }
}