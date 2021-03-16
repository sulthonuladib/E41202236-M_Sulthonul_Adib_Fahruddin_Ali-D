import persons.Person;

public class ManagingPeople {
    public static void main(String[] args) {
        Person p1 = new Person("Arial", 20);
        Person p2 = new Person("Joseph", 123456789);

        if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as  " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as  " + p2.getName());
        }

    }
}
