package oppgave1;

import java.util.Scanner;

public class Student {
    private final String name;
    private int numExercises;

    public Student(String name, int numExercises) {
        this.name = name;
        this.numExercises = numExercises;
    }

    public String getName() {
        return this.name;
    }
    public int getNumExercises() {
        return this.numExercises;
    }

    public void increaseNumExercises(int amount) {
        this.numExercises += amount;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Exercises: " + numExercises;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type in name of student"); String name = in.next();
        System.out.println("Enter the number of exercises that " + name + " has completed and which are approved"); int numExercises = in.nextInt();
        Student newStudent = new Student(name, numExercises);
        System.out.printf("New student with name %s, and %d exercises completed has been created\n",
                newStudent.getName(), newStudent.getNumExercises());
        System.out.println("Increasing number of exercises that are approved by 4");
        newStudent.increaseNumExercises(4);
        System.out.println(newStudent);
    }

}
