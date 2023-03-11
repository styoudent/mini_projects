package main.board;

import main.tic_tac_toe_data.Variables;

import java.lang.reflect.Array;

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
        initializeBoard(BoardSizeX, BoardSizeY);
    }


    private void initializeBoard(int SquareBoardSize) {
        board = new char[SquareBoardSize][SquareBoardSize];
    }
    private void initializeBoard(int BoardSizeX, int BoardSizeY) {
        board = new char[BoardSizeX][BoardSizeY];
    }


    public char[][] getBoard() { return board; }
}
