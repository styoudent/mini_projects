package main.board;

import main.tic_tac_toe_data.Variables;

public class Board {
    char board[][];
    int defaultBoardSize = 3;
    char signOfEmptyField = '-';


    public Board() {
        initializeBoard(defaultBoardSize);
    }
    public Board(int SquareBoardSize) {
        initializeBoard(SquareBoardSize);
    }
    public Board(int BoardSizeX, int BoardSizeY) {
        initializeBoard(BoardSizeY, BoardSizeX);
    }


    private void initializeBoard(int SquareBoardSize) {
        board = new char[SquareBoardSize][SquareBoardSize];
    }
    private void initializeBoard(int BoardSizeX, int BoardSizeY) {
        board = new char[BoardSizeX][BoardSizeY];
    }

    public void fillBoardWith(char signOfEmptyField) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                this.board[i][j] = signOfEmptyField;
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j != board[i].length - 1)
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


    public char[][] getBoard() { return board; }
}
