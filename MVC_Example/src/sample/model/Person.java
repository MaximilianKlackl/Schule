package sample.model;

import sample.util.PersonStorage;

import java.util.List;

public class Person {

    private long id;
    private String name;
    private int age;

    public Person(long id, String name, int age) {
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + "\n";
    }

    public static Person getPersonById(long id){
        return PersonStorage.allPersons
                .stream()
                .filter(p -> p.id == id)
                .findFirst()
                .orElse(null);
    }

    public static List<Person> getAllPersons(){
        return PersonStorage.allPersons;
    }
}
