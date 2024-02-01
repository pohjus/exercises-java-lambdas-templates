package exercise;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FlyableTest {

    @Test
    public void testFly() {
        Flyable flyable = speed -> "Test flying with speed of " + speed;
        String result = flyable.fly(10);
        assertEquals("Test flying with speed of 10", result);
    }

    @Test
    public void testGetMessage() {
        String message = Flyable.getMessage(20);
        assertEquals("flying with speed of 20", message);
    }
}
