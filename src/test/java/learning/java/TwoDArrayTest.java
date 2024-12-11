package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDArrayTest {
    @Test
    public void testIsDiagonalTrue() {
        double[][] diagonalMatrix = {
                {1.0, 0.0, 0.0},
                {0.0, 2.0, 0.0},
                {0.0, 0.0, 3.0}
        };
        TwoDArray twoDArray = new TwoDArray(diagonalMatrix);

        assertTrue(twoDArray.isDiagonal(), "Матриця діагональна, але метод повертає false");
    }

    @Test
    public void testIsDiagonalFalse() {
        double[][] nonDiagonalMatrix = {
                {1.0, 2.0, 0.0},
                {0.0, 2.0, 0.0},
                {0.0, 0.0, 3.0}
        };
        TwoDArray twoDArray = new TwoDArray(nonDiagonalMatrix);

        assertFalse(twoDArray.isDiagonal(), "Матриця не діагональна, але метод повертає true");
    }

}