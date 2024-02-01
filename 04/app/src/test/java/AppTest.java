package exercise;
import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testSortByLastnameAndOutputUsingInnerClasses() {
        List<Person> people = List.of(
            new Person("Jack", "Smith"),
            new Person("Tina", "Bauer")
        );

        String result = App.sortByLastnameAndOutputUsingInnerClasses(people);

        String expected = "Person[firstName=Tina, lastName=Bauer] | Person[firstName=Jack, lastName=Smith]";
        assertEquals(expected, result);
    }

    @Test
    public void testSortByLastnameAndOutputUsingLambdas() {
        List<Person> people = List.of(
            new Person("Jack", "Smith"),
            new Person("Tina", "Bauer")
        );

        String result = App.sortByLastnameAndOutputUsingLambdas(people);

        String expected = "Person[firstName=Tina, lastName=Bauer] | Person[firstName=Jack, lastName=Smith]";
        assertEquals(expected, result);
    }

    @Test
    public void testSortByLastnameAndOutputUsingMethodReferences() {
        List<Person> people = List.of(
            new Person("Jack", "Smith"),
            new Person("Tina", "Bauer")
        );

        String result = App.sortByLastnameAndOutputUsingMethodReferences(people);

        String expected = "Person[firstName=Tina, lastName=Bauer] | Person[firstName=Jack, lastName=Smith]";
        assertEquals(expected, result);
    }

    @Test
    public void testSortByFirstnameAndOutputUsingInnerClasses() {
        List<Person> people = List.of(
            new Person("Jack", "Smith"),
            new Person("Tina", "Bauer")
        );

        String result = App.sortByFirstnameAndOutputUsingInnerClasses(people);

        String expected = "Person[firstName=Jack, lastName=Smith] | Person[firstName=Tina, lastName=Bauer]";
        assertEquals(expected, result);
    }

    @Test
    public void testSortByFirstNameAndOutputUsingLambdas() {
        List<Person> people = List.of(
            new Person("Jack", "Smith"),
            new Person("Tina", "Bauer")
        );

        String result = App.sortByFirstNameAndOutputUsingLambdas(people);

        String expected = "Person[firstName=Jack, lastName=Smith] | Person[firstName=Tina, lastName=Bauer]";
        assertEquals(expected, result);
    }

    @Test
    public void testSortByFirstnameAndOutputUsingMethodReferences() {
        List<Person> people = List.of(
            new Person("Jack", "Smith"),
            new Person("Tina", "Bauer")
        );

        String result = App.sortByFirstnameAndOutputUsingMethodReferences(people);

        String expected = "Person[firstName=Jack, lastName=Smith] | Person[firstName=Tina, lastName=Bauer]";
        assertEquals(expected, result);
    }
}
