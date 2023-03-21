package main.board;

public class Board {
    char[][] board;

    public void setBoard(int SizeX, int SizeY) {
        this.board = new char[SizeY][SizeX];
    }
    public char[][] getBoard() { return board; }
//mk
    public void fillBoardWith(char signOfEmptyField) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                this.board[i][j] = signOfEmptyField;
    }

    public void fillBoardWithDefaultSigns() {
        fillBoardWith('-');
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

    public void changeField (int coordX, int coordY, char newChar) {
    }
}
