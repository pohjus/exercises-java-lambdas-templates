package exercise;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testCompareByLastName() {
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Alice", "Smith");
        Person person3 = new Person("Bob", "Johnson");

        // Test when the last names are in alphabetical order
        assertTrue(Person.compareByLastName(person1, person2) < 0);
        assertTrue(Person.compareByLastName(person1, person1) == 0);
        assertTrue(Person.compareByLastName(person2, person1) > 0);

        // Test when the last names are not in alphabetical order
        assertTrue(Person.compareByLastName(person1, person3) < 0);
        assertTrue(Person.compareByLastName(person3, person1) > 0);
    }

    @Test
    public void testCompareByFirstName() {
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Alice", "Smith");
        Person person3 = new Person("Bob", "Johnson");

        // Test when the first names are in alphabetical order
        assertTrue(person1.compareByFirstName(person2) > 0);
        assertTrue(person1.compareByFirstName(person1) == 0);
        assertTrue(person2.compareByFirstName(person1) < 0);

        // Test when the first names are not in alphabetical order
        assertTrue(person1.compareByFirstName(person3) > 0);
        assertTrue(person3.compareByFirstName(person1) < 0);

    }
}
