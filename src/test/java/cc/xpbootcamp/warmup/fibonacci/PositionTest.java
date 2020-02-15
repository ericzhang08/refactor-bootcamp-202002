package cc.xpbootcamp.warmup.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTest {

    @Test
    void should_return_1_when_calculate_given_position_1() {
        assertEquals(1, new Position(1).calculate());
    }

    @Test
    void should_return_1_when_calculate_given_position_2() {
        assertEquals(1, new Position(2).calculate());
    }
}
