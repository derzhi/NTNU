package oppgave1;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class Employee {
    private final Person person;
    private final int employeeNumber, yearOfEmployement;
    private double monthlySalary, taxPercentage;
    private final GregorianCalendar calendar = new GregorianCalendar();

    public Employee(Person person, int employeeNumber, int yearOfEmployement, double monthlySalary, double taxPercentage) {
        this.person = person;
        this.employeeNumber = employeeNumber;
        this.yearOfEmployement = yearOfEmployement;
        this.monthlySalary = monthlySalary;
        this.taxPercentage = taxPercentage;
    }

    public Person getPerson() {
        return person;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public int getYearOfEmployement() {
        return yearOfEmployement;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double monthlySalaryTaxed() {
        return monthlySalary * (taxPercentage / 100);
    }

    public double yearlySalaryTaxed() {
        double tenMonths = monthlySalaryTaxed() * 10;
        double december = monthlySalary * (taxPercentage / 100) * 0.5;
        double totalTaxed = tenMonths + december;
        return totalTaxed;
    }

    public double grossSalaryYear() {
        return monthlySalary * 12;
    }

    public String fullName() {
        String fullname = String.format("%s, %s", person.getFirstName(), person.getLastName());
        return fullname;
    }

    public int getAge() {
        int currentYear = calendar.get(Calendar.YEAR);
        int age = currentYear - person.getYearOfBirth();
        return age;
    }

    public int yearsOfEmployement() {
        int currentYear = calendar.get(Calendar.YEAR);
        int yearsOfEmployement = currentYear - yearOfEmployement;
        return yearsOfEmployement;
    }

    public boolean hasWorkedMoreThan(int yearsWorked) {
        return yearsOfEmployement() > yearsWorked;
    }


}

/*
fullName() Sequence Diagram:

[Employee]             [Person]
    |                     |
    |----getFirstName()-->|
    |                     |
    |<---Return first name|
    |                     |
    |----getLastName()--->|
    |                     |
    |<---Return last name-|
    |                     |
    |Combine and return full name|
    |                     |

getAge() Sequence Diagram:

[Employee]               [Person]
    |                       |
    | Retrieve current year |
    |                       |
    |---getYearOfBirth()--->|
    |                       |
    |<--Return year of birth|
    |                       |
    |Calculate and return age|
    |                       |

 */
