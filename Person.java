
import java.util.GregorianCalendar;

/**
 *
 * @author Robin Dupuis
 */
public class Person {

    private String name;
    private final GregorianCalendar birthDate;

    public Person(String name, GregorianCalendar birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GregorianCalendar getBirthDate() {
        return birthDate;
    }

    @Override
      public boolean equals(Object obj) {
        Person person = (Person)obj;//casting the object parameter obj to a Person object
        return name.equals(person.name) && birthDate.equals(person.birthDate);//checks if the name and birthdate of both objects are equal
    }
    
    

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthDate="
                + birthDate + '}';
    }

    public static void main(String[] args) {
        Person john = new Person("John", new GregorianCalendar(2003, 8, 28));
        Person mary = new Person("Mary", new GregorianCalendar(2004, 3, 23));
        System.out.println(john);
        System.out.println(mary);
        Person john1 = new Person("John", new GregorianCalendar(2003, 8, 28));
        Person john2 = new Person("John", new GregorianCalendar(2000, 10, 10));
        Person john3 = new Person("john", new GregorianCalendar(2003, 8, 28));

        System.out.println(john1.equals(john));
        System.out.println(john2.equals(john));
        System.out.println(john3.equals(john));
    }
}
