package main.game;

import java.util.Arrays;
import java.util.Scanner;

public class Game {

    public void initializeGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of game board in format \"X Y\" ");
        String userInputBoardSize = scanner.nextLine();
//        validateUserInput("1 4");
        scanner.close();
        System.out.println(userInputBoardSize);
//        userInputBoardSize.
//        Board board = new Board();
//        board.setBoard(stringFromInput);
//        board.fillBoardWithDefaultSigns();
    }
    public boolean validateUserInput(String StrToValidate) {
        boolean isInputCorrect = false;
        int wordsNum = 0;
        String[] splitted;
        int[] convertedToInt = new int[2];
        try {
            StrToValidate = StrToValidate.trim();
            splitted = StrToValidate.split("\\s+");
            wordsNum=splitted.length;
            for (int i = 0; i < 2; i++) {
                convertedToInt[i] = Integer.parseInt(splitted[i]);
            }
            System.out.println(Arrays.toString(splitted));
        } catch (Exception e) {
            System.out.println("Wrong input: " + e.getMessage());
        }

        if (wordsNum == 2)
            isInputCorrect = true;
        return isInputCorrect;
    }
    public void isInput2Words() {


    }
    public void isInputInt() {


    }
}
