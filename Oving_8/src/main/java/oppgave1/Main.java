package oppgave1;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Employee newEmployee = createEmployee();
        displayEmployee(newEmployee);

        while(true) {
            menu(newEmployee);
        }
    }

    public static Employee createEmployee() {
        System.out.println("Add new employee");

        System.out.println("First name:  "); String firstName = in.nextLine();
        System.out.println("Last name:  "); String lastName = in.nextLine();
        System.out.println("Year of birth: "); int yearOfBirth = in.nextInt();
        Person newPerson = new Person(firstName, lastName, yearOfBirth);

        System.out.println("Employee number: "); int employeeNumber = in.nextInt();
        System.out.println("Year of employment: "); int yearOfEmployement = in.nextInt();
        System.out.println("Monthly salary: "); double monthlySalary = in.nextDouble();
        System.out.println("Tax percentage: "); double taxPercentage = in.nextDouble();

        return new Employee(newPerson, employeeNumber,yearOfEmployement , monthlySalary, taxPercentage);
    }

    public static void displayEmployee(Employee employee) {
        System.out.println();
        System.out.println("Name: " + employee.fullName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Tax paid per month: " + employee.monthlySalaryTaxed());
        System.out.println("Tax paid per year: " + employee.yearlySalaryTaxed());
        System.out.println("Years of employment: " + employee.yearsOfEmployement());
        System.out.println("Has worked over 10 years: " + employee.hasWorkedMoreThan(10));
    }

    public static void menu(Employee employee) {
        System.out.println("");
        System.out.println("Press 1 to edit monthly salary");
        System.out.println("Press 2 to edit tax percentage");
        System.out.println("Press 3 to display employee information");
        int menuInput = in.nextInt();

        if (menuInput == 1) {
            System.out.println("Type in new monthly salary:");
            double newMonthlySalary = in.nextDouble();
            employee.setMonthlySalary(newMonthlySalary);
            System.out.println("The new monthly salary is set to: " + employee.getMonthlySalary());
        } else if (menuInput == 2) {
            System.out.println("Type in new tax percentage:");
            double newTaxPercentage = in.nextDouble();
            employee.setTaxPercentage(newTaxPercentage);
            System.out.println("The new tax percentage is set to: " + employee.getTaxPercentage());
        } else if (menuInput == 3) {
            displayEmployee(employee);
        } else {
            System.out.println("Type in a valid number");
        }
    }

}
