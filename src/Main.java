import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("David", "1234", 44);
        Person p2 = new Person("Lois", "1234", 30);

        Person p3 = p1;

        System.out.println(p3.name);
        p1.name = "Susan";

        System.out.println(p1.name);
        System.out.println(p3.name);

        Person p4 = new Person();
        System.out.println(p4.name);

        p1.greet();
        p4.greet();

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        for(Person person : persons) {
            System.out.println(person);
            //person.greet();
        }


    }
}