package exercise.gui;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyWindowTest {

    @Test
    public void testMouseEntered() {
        MyWindow myWindow = new MyWindow();
        String result = myWindow.mouseEntered();
        assertEquals("Mouse entered the window.", result);
    }

    @Test
    public void testMouseExited() {
        MyWindow myWindow = new MyWindow();
        String result = myWindow.mouseExited();
        assertEquals("Mouse exited the window.", result);
    }
}
