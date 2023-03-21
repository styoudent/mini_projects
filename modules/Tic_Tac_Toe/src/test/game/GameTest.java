package test.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.game.Game;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    private Game game;
    private String TestString;

    @BeforeEach
    void setUpForTests() {
        game = new Game();
    }
    @Test
    void ifInputCorrectThenShouldValidate() {
        TestString = "3 5";
        boolean actual = game.validateUserInput(TestString);
        assertEquals(true, actual);
    }
    @Test
    void isUserInputValidated2() {
        TestString = " 43\n5";
        boolean actual = game.validateUserInput(TestString);
        assertEquals(true, actual);
    }
    @Test
    void if1IntInputThenShouldNotValidate() {
        TestString = "453";
        boolean actual = game.validateUserInput(TestString);
        assertEquals(false, actual);
    }
    @Test
    void if3IntsInputThenShouldNotValidate() {
        TestString = "031 522 31";
        boolean actual = game.validateUserInput(TestString);
        assertEquals(false, actual);
    }
    @Test
    void ifNotIntInputThenShouldNotValidate() {
        TestString = "Not Int";
        boolean actual = game.validateUserInput(TestString);
        assertEquals(false, actual);
    }
}
