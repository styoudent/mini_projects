package main;

import main.board.Board;
import main.game.Game;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Board board = new Board();
        board.setBoard(5,4);
//        board.fillBoardWith('-');
        board.printBoard();
        System.out.println("bla");

/*        try {
            System.out.println("Naciśnij dowolny klawisz w ciągu 5 sekund:");
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < 5000 && System.in.available() == 0) {
                Thread.sleep(100);
            }
            if (System.in.available() > 0) {
                char c = (char) System.in.read();
                System.out.println("Wprowadzono znak: " + c);
            } else {
                System.out.println("Nie wprowadzono żadnego znaku w ciągu 5 sekund.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }*/


        /*long startTime = System.currentTimeMillis(); // czas początkowy
        long maxWaitTime = 5000; // czas maksymalnego oczekiwania w ms
        long elapsedTime = 0; // czas, który minął
        boolean inputReceived = false; // flaga określająca, czy otrzymano dane wejściowe
        String userInput = null;
        Scanner scanner = new Scanner(System.in);

        
        while (!inputReceived && elapsedTime < maxWaitTime) {
            if (System.in.available() > 0) { // sprawdzenie, czy są dostępne dane wejściowe
                userInput = scanner.nextLine(); // odczytanie danych wejściowych
                inputReceived = true;
            }
            elapsedTime = System.currentTimeMillis() - startTime; // aktualizacja czasu, który minął
        }

        if (inputReceived) {
            System.out.println("Dane wejściowe zostały wprowadzone: " + userInput);
        } else {
            System.out.println("Nie wprowadzono danych wejściowych w ciągu " + maxWaitTime + " ms.");
        }
        scanner.close();*/
//        Game game = new Game();
//        game.initializeGame();
    }
}