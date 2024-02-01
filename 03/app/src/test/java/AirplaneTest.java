package exercise;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AirplaneTest {

    @Test
    public void testFly() {
        Airplane airplane = new Airplane();
        String result = airplane.fly(500);
        assertEquals("Airplane flying with a speed of 500.", result);
    }

    @Test
    public void testFlyZeroSpeed() {
        Airplane airplane = new Airplane();
        String result = airplane.fly(0);
        assertEquals("Airplane flying with a speed of 0.", result);
    }

    @Test
    public void testFlyNegativeSpeed() {
        Airplane airplane = new Airplane();
        String result = airplane.fly(-100);
        assertEquals("Airplane flying with a speed of -100.", result);
    }
}
