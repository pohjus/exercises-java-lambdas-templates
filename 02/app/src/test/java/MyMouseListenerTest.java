package exercise.gui;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMouseListenerTest {

    @Test
    public void testMouseEntered() {
        MyMouseListener mouseListener = new MyMouseListener() {
            @Override
            public String mouseEntered() {
                return "Mouse entered.";
            }

            @Override
            public String mouseExited() {
                return null; // Not needed for this test
            }
        };
        String result = mouseListener.mouseEntered();
        assertEquals("Mouse entered.", result);
    }

    @Test
    public void testMouseExited() {
        MyMouseListener mouseListener = new MyMouseListener() {
            @Override
            public String mouseEntered() {
                return null; // Not needed for this test
            }

            @Override
            public String mouseExited() {
                return "Mouse exited.";
            }
        };
        String result = mouseListener.mouseExited();
        assertEquals("Mouse exited.", result);
    }
}
