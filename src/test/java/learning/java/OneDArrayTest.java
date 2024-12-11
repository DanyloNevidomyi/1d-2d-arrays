package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneDArrayTest {
    @Test
    public void testNormalizeArray() {
        double[] inputArray = {3.0, 4.0};
        OneDArray oneDArray = new OneDArray(inputArray);

        double[] normalizedArray = oneDArray.normalizeArray();
        double[] expectedArray = {0.6, 0.8};

        assertArrayEquals(expectedArray, normalizedArray, 0.001, "Нормалізація працює некоректно");
    }

}