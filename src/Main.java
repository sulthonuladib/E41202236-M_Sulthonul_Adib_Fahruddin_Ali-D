import students.Person;

public class Main {
    public static void main(String[] args) {
        Person lisa = new Person("Lisa", "Palombo", 123456789, true);

        System.out.println("Student Name: " + lisa.firstName + " " + lisa.lastName);
        System.out.println("Student ID" + lisa.ID);

        if (lisa.status == true) {
            System.out.println("Student Status: Active");
        } else {
            System.out.println("Student Status: Tidak Active");
        }
    }
}
