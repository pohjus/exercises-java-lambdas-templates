package exercise.animals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogTest {

    @Test
    public void testMakeSound() {
        Dog dog = new Dog();
        String sound = dog.makeSound();
        assertEquals("bark bark!", sound);
    }

    @Test
    public void testSell() {
        Dog dog = new Dog();
        String result = dog.sell();
        assertEquals("Dog is sold.", result);
    }
}
