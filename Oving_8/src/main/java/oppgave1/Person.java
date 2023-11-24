package oppgave1;

import java.util.GregorianCalendar;

public class Person {
    private final String firstName, lastName;
    private final int yearOfBirth;

    public Person(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() {
        return lastName;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }


}
