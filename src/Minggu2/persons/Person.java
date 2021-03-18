package Minggu2.persons;

public class Person {
    public String name;
    public int age;

    public Person(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String setName(String newName) {
        return this.name = newName;
    }
}
