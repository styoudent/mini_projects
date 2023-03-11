package test.board;

import main.board.Board;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.custom_asserts.ArrayAsserts.assert2DArrayIsFilledWith;


class BoardTest {
    @Test
    void ifDefaultConstructorThen3Rows() {
        Board board = new Board();
        assertEquals(3, board.getBoard()[0].length);
    }
    @Test
    void ifDefaultConstructorThen3Columns() {
        Board board = new Board();
        assertEquals(3, board.getBoard().length);
    }
    @Test
    void ifSquareBoardOfSize5Then5Rows() {
        Board board = new Board(5);
        assertEquals(5, board.getBoard().length);
    }
    @Test
    void ifSquareBoardOfSize5Then5Columns() {
        Board board = new Board(5);
        assertEquals(5, board.getBoard().length);
    }
    @Test
    void ifXYBoardOfX5Then5Columns() {
        Board board = new Board(5,4);
        assertEquals(5, board.getBoard()[0].length);
    }
    @Test
    void ifXYBoardOfY4Then4Columns() {
        Board board = new Board(5,4);
        assertEquals(4, board.getBoard().length);
    }
    @Test
    void isDefaultBoardFilledWithSpecificChar() {
        Board board = new Board();
        board.fillBoardWith('-');
        assert2DArrayIsFilledWith('-', board.getBoard());
    }
    @Test
    void isSquareBoardFilledWithSpecificChar() {
        Board board = new Board(4);
        board.fillBoardWith('-');
        assert2DArrayIsFilledWith('-', board.getBoard());
    }
    @Test
    void isXYBoardFilledWithSpecificChar() {
        Board board = new Board(5,4);
        board.fillBoardWith('-');
        assert2DArrayIsFilledWith('-', board.getBoard());
    }
    @Test
    void isDefaultBoardPrinted() {
        String expectedOutput = "-  -  -\r\n-  -  -\r\n-  -  -\r\n";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Board board = new Board();
        board.fillBoardWith('-');
        board.printBoard();
        assertEquals(expectedOutput, outContent.toString());
    }
    @Test
    void isSquareBoardOfSize4Printed() {
        String expectedOutput = "-  -  -  -\r\n-  -  -  -\r\n" +
                "-  -  -  -\r\n-  -  -  -\r\n";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Board board = new Board(4);
        board.fillBoardWith('-');
        board.printBoard();
        assertEquals(expectedOutput, outContent.toString());
    }
    @Test
    void isXYBoardOfSizeX5AndY2Printed() {
        String expectedOutput = "-  -  -  -  -\r\n-  -  -  -  -\r\n";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Board board = new Board(5,2);
        board.fillBoardWith('-');
        board.printBoard();
        assertEquals(expectedOutput, outContent.toString());
    }
}
