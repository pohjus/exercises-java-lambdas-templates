package exercise;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BirdTest {

    @Test
    public void testFlyForwards() {
        Bird bird = new Bird();
        String result = bird.fly(10);
        assertEquals("flying forwards.", result);
    }

    @Test
    public void testFlyBackwards() {
        Bird bird = new Bird();
        String result = bird.fly(-5);
        assertEquals("flying backwards.", result);
    }

    @Test
    public void testFlyZeroSpeed() {
        Bird bird = new Bird();
        String result = bird.fly(0);
        assertEquals("flying backwards.", result); // Zero speed should be considered as flying backwards
    }
}
