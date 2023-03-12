package test.board;

import main.board.Board;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.custom_asserts.ArrayAsserts.assert2DArrayIsFilledWith;


class BoardTest {
    @Test
    void ifBoardOfX5Then5Columns() {
        Board board = new Board();
        board.setBoard(5,4);
        assertEquals(5, board.getBoard()[0].length);
    }
    @Test
    void ifBoardOfY4Then4Rows() {
        Board board = new Board();
        board.setBoard(5,4);
        assertEquals(4, board.getBoard().length);
    }
    @Test
    void isBoardOfSizeX2AndY4FilledWithDefaultSignsOfEmptyField() {
        Board board = new Board();
        board.setBoard(2,4);
        board.fillBoardWithDefaultSigns();
        assert2DArrayIsFilledWith('-', board.getBoard());
    }
    @Test
    void isBoardOfSizeX8AndY3FilledWithSpecificChar() {
        Board board = new Board();
        board.setBoard(8,3);
        board.fillBoardWith('$');
        assert2DArrayIsFilledWith('$', board.getBoard());
    }
    @Test
    void isXYBoardOfSizeX5AndY2Printed() {
        String expectedOutput = "-  -  -  -  -\r\n-  -  -  -  -\r\n";
        Board board = new Board();
        board.setBoard(5,2);
        board.fillBoardWithDefaultSigns();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        board.printBoard();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void changeField() {
    }
}
