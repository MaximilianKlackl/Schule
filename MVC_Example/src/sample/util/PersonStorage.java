package sample.util;

import sample.model.Person;

import java.util.Arrays;
import java.util.List;

public class PersonStorage {

    public static List<Person> allPersons = Arrays.asList(
            new Person(1, "Max", 18),
            new Person(2, "Daniel", 18),
            new Person(3, "Thomas", 17),
            new Person(4, "Patrick", 18)
    );
}
