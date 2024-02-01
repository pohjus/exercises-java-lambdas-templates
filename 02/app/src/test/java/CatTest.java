package exercise.animals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void testMakeSound() {
        Cat cat = new Cat();
        String sound = cat.makeSound();
        assertEquals("meow!", sound);
    }

    @Test
    public void testSell() {
        Cat cat = new Cat();
        String result = cat.sell();
        assertEquals("Cat is sold.", result);
    }
}
