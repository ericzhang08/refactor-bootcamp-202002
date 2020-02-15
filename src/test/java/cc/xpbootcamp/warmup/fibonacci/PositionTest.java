package cc.xpbootcamp.warmup.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTest {

    @Test
    void should_return_1_when_calculate_given_position_1() {
        checkFib(1, 1);
    }


    @Test
    void should_return_1_when_calculate_given_position_2() {
        checkFib(1, 2);
    }

    @Test
    void should_return_2_when_calculate_given_position_3() {
        checkFib(2, 3);
    }

    @Test
    void should_return_3_when_calculate_given_position_4() {
        checkFib(3, 4);
    }

    private void checkFib(int expect, int index) {
        assertEquals(expect, new Position(index).calculate());
    }

}
