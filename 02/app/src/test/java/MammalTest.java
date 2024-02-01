package exercise.animals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MammalTest {

    @Test
    public void testGiveBirth() {
        Mammal mammal = new Mammal() {
            @Override
            public String makeSound() {
                return null; // Not needed for this test
            }
        };
        String result = mammal.giveBirth();
        assertEquals("Giving birth.", result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testMakeSound() {
        Mammal mammal = new Mammal() {
            @Override
            public String makeSound() {
                throw new UnsupportedOperationException();
            }
        };
        mammal.makeSound();
    }
}
