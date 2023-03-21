package test.board;

import main.board.Board;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.custom_asserts.ArrayAsserts.assert2DArrayIsFilledWith;


class BoardTest {
    private Board board;

    @BeforeEach
    void setUpForTests(){
        board = new Board();
        board.setBoard(5,2);
    }

    @Test
    void ifBoardOfX5Then5Columns() {
        assertEquals(5, board.getBoard()[0].length);
    }
    @Test
    void ifBoardOfY2Then2Rows() {
        assertEquals(2, board.getBoard().length);
    }
    @Test
    void isBoardFilledWithDefaultSignsOfEmptyField() {
        board.fillBoardWithDefaultSigns();
        assert2DArrayIsFilledWith('-', board.getBoard());
    }
    @Test
    void isBoardFilledWithSpecificChar() {
        board.fillBoardWith('$');
        assert2DArrayIsFilledWith('$', board.getBoard());
    }
    @Test
    void isEmptyBoardPrinted() {
        String expectedOutput = "\u0000  \u0000  \u0000  \u0000  \u0000\r\n" +
                "\u0000  \u0000  \u0000  \u0000  \u0000\r\n";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        board.printBoard();
        assertEquals(expectedOutput, outContent.toString());
    }
    @Test
    void isFilledBoardPrinted() {
        String expectedOutput = "-  -  -  -  -\r\n-  -  -  -  -\r\n";
    void isXYBoardOfSizeX5AndY2Printed() {
        board.fillBoardWithDefaultSigns();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        board.printBoard();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    @Disabled
    void changeField() {
    }
}
