package exercise;

import exercise.animals.Cat;
import exercise.animals.Dog;
import exercise.animals.Mammal;
import exercise.gui.MyMouseListener;
import exercise.gui.MyWindow;
import exercise.sellablethings.Computer;
import exercise.sellablethings.Sellable;
import exercise.shapes.Shape;
import exercise.shapes.Rectangle;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AppTest {

    @Test
    public void testGetRandomShape() {
        Shape shape = App.getRandomShape();
        assertEquals(Rectangle.class, shape.getClass());
    }

    @Test
    public void testGetRandomMammal() {
        Mammal mammal = App.getRandomMammal();
        assertEquals(true, mammal instanceof Dog || mammal instanceof Cat);
    }

    @Test
    public void testGetRandomSellable() {
        Sellable sellable = App.getRandomSellable();
        assertEquals(true, sellable instanceof Dog || sellable instanceof Cat || sellable instanceof Computer);
    }

    @Test
    public void testGetRandomMouseListener() {
        MyMouseListener listener = App.getRandomMouseListener();
        assertEquals(MyWindow.class, listener.getClass());
    }

    @Test
    public void testMethodReference() {
        String result = App.methodReference();
        assertEquals("method reference.", result);
    }
}
