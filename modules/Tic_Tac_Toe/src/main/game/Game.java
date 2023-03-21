package main.game;

import java.util.Scanner;

public class Game {

    public void initializeGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of game board in format \"X Y\" ");
        String userInputBoardSize = scanner.nextLine();
        scanner.close();
        System.out.println(userInputBoardSize);
//        userInputBoardSize.
//        Board board = new Board();
//        board.setBoard(stringFromInput);
//        board.fillBoardWithDefaultSigns();
    }
}
