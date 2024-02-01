package exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class OuterTest {

    @Test
    public void testCreateInner() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.createInner();
        assertNotNull(inner);
    }

    @Test
    public void testGetOuterX() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.createInner();
        int result = inner.getOuterX();
        assertEquals(1, result);
    }
}
