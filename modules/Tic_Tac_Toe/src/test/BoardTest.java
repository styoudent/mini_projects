package test;

import main.board.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


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

}
