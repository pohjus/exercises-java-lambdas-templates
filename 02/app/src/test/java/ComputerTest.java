package exercise.sellablethings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {

    @Test
    public void testSell() {
        Computer computer = new Computer();
        String result = computer.sell();
        assertEquals("Computer is sold.", result);
    }
}
