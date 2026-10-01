package golfscorecalc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void returnsZeroIfAnEmptyArrayIsPassed() {
        assertEquals(0, Utils.arrayNumSum(new int[]{}));
    }

    @Test
    void returnCorrectValue() {
        assertEquals(15, Utils.arrayNumSum(new int[]{1,2,3,4,5}));
        assertEquals(12, Utils.arrayNumSum(new int[]{2,4,6}));
    }

}