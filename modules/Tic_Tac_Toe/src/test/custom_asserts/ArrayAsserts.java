package test.custom_asserts;

import org.junit.jupiter.api.Assertions;

public class ArrayAsserts {

    public static void assert2DArrayIsFilledWith(char expected, char[][] actual) {
        for (int i = 0; i < actual.length; i++)
            for (int j = 0; j < actual[i].length; j++)
                Assertions.assertEquals(expected, actual[i][j]);
    }
}