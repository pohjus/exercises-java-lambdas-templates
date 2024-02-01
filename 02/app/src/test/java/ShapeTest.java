package exercise.shapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ShapeTest {

    @Test
    public void testDefaultConstructor() {
        // As Shape is abstract, we can create a subclass instance for testing
        Shape shape = new Rectangle();
        assertEquals(0, shape.getX());
        assertEquals(0, shape.getY());
    }

    @Test
    public void testParameterizedConstructor() {
        // As Shape is abstract, we can create a subclass instance for testing
        Shape shape = new Rectangle(1, 2, 3, 4);
        assertEquals(1, shape.getX());
        assertEquals(2, shape.getY());
    }

    @Test
    public void testToString() {
        // As Shape is abstract, we can create a subclass instance for testing
        Shape shape = new Rectangle(1, 2, 3, 4);
        assertEquals("Rectangle{x=1, y=2, width=3, height=4}", shape.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        // As Shape is abstract, we can create subclass instances for testing
        Shape shape1 = new Rectangle(1, 2, 3, 4);
        Shape shape2 = new Rectangle(1, 2, 3, 4);
        Shape shape3 = new Rectangle(5, 6, 7, 8);

        assertEquals(shape1, shape2);
        assertEquals(shape1.hashCode(), shape2.hashCode());
        assertNotEquals(shape1, shape3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetXNegative() {
        // As Shape is abstract, we can create a subclass instance for testing
        Shape shape = new Rectangle();
        shape.setX(-1);
    }

    @Test
    public void testSetX() {
        // As Shape is abstract, we can create a subclass instance for testing
        Shape shape = new Rectangle();
        shape.setX(5);
        assertEquals(5, shape.getX());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetYNegative() {
        // As Shape is abstract, we can create a subclass instance for testing
        Shape shape = new Rectangle();
        shape.setY(-1);
    }

    @Test
    public void testSetY() {
        // As Shape is abstract, we can create a subclass instance for testing
        Shape shape = new Rectangle();
        shape.setY(6);
        assertEquals(6, shape.getY());
    }
}
