package exercise.shapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RectangleTest {

    @Test
    public void testDefaultConstructor() {
        Rectangle rectangle = new Rectangle();
        assertEquals(0, rectangle.getX());
        assertEquals(0, rectangle.getY());
        assertEquals(0, rectangle.getWidth());
        assertEquals(0, rectangle.getHeight());
    }

    @Test
    public void testParameterizedConstructor() {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        assertEquals(1, rectangle.getX());
        assertEquals(2, rectangle.getY());
        assertEquals(3, rectangle.getWidth());
        assertEquals(4, rectangle.getHeight());
    }

    @Test
    public void testToString() {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        assertEquals("Rectangle{x=1, y=2, width=3, height=4}", rectangle.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        Rectangle rectangle1 = new Rectangle(1, 2, 3, 4);
        Rectangle rectangle2 = new Rectangle(1, 2, 3, 4);
        Rectangle rectangle3 = new Rectangle(5, 6, 7, 8);

        assertEquals(rectangle1, rectangle2);
        assertEquals(rectangle1.hashCode(), rectangle2.hashCode());
        assertNotEquals(rectangle1, rectangle3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWidthNegative() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(-1);
    }

    @Test
    public void testSetWidth() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        assertEquals(5, rectangle.getWidth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetHeightNegative() {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(-1);
    }

    @Test
    public void testSetHeight() {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(6);
        assertEquals(6, rectangle.getHeight());
    }
}
