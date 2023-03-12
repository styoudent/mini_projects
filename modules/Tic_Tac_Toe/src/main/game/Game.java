package main.game;

import main.board.Board;

import java.io.IOException;
import java.util.Scanner;

public class Game {

    public void initializeGame() throws IOException {
        long startTimeInMilliseconds = System.currentTimeMillis();
        long maxWaitTimeInMilliseconds = 10000;
        long elapsedTimeInMilliseconds = 0;
        boolean isInputReceived = false;
        String userInputBoardSizeXY = null;
        Scanner scanner = new Scanner(System.in);

        Board board = new Board();
        System.out.println("Enter the size of game board in format \"X Y\" ");
        try {
            while (!isInputReceived && elapsedTimeInMilliseconds < maxWaitTimeInMilliseconds) {
                if (System.in.available() > 0) {
                    userInputBoardSizeXY = scanner.nextLine();
                    isInputReceived = true;
                }
                elapsedTimeInMilliseconds = System.currentTimeMillis() - startTimeInMilliseconds; // aktualizacja czasu, który minął
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe);

        }
        if (isInputReceived) {
            System.out.println("Dane wejściowe zostały wprowadzone: " + userInputBoardSizeXY);
//            board.
        }
        else {
            System.out.println("Nie wprowadzono danych wejściowych w ciągu " + maxWaitTimeInMilliseconds + " ms.");
        }
        scanner.close();
    }
}
