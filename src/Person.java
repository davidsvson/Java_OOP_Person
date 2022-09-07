public class Person {       // klass är en mall av ett objecy
    String name;            //instansvariabler
    String phoneNumber;
    int age;

    public Person() {
        this.name = "--";
        this.phoneNumber = "--";
        this.age = 0;
    }

    public Person(String name, String phoneNumber, int age ) { // kontruktor
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public void greet() {   //metoder
        System.out.println("Hej jag heter " + this.name);
    }

    public String toString() {
        return "Name: " + this.name +
                " Phone: " + this.phoneNumber +
                " Age: " + this.age;
    }

}

