package oppgave1;

import java.util.Scanner;

public class Main {
    private static ExerciseOverview overview;
    private static Scanner in;

    public static void main(String[] args) {
        overview = new ExerciseOverview();
        in = new Scanner(System.in);
        start();

        while(true) {
          meny();
        }
    }

    public static void start() {
      overview.registerStudent("Adrian", 2);
      overview.registerStudent("Bjarne", 6);
      overview.registerStudent("Ida", 7);

      System.out.println();
      System.out.println();
      System.out.println("Exercise overview for students");
      System.out.println("-----------------------------");
    }
    public static void meny() {
      System.out.println("[1] - Find number of students registered");
      System.out.println("[2] - Find number of exercises completed by a student");
      System.out.println("[3] - Increase number of exercises of a student");
      System.out.println("[4] - Register new student");


      int input = in.nextInt();

      switch (input) {
        case 1 -> System.out.println("Number of students registered: " + ExerciseOverview.getNumStudents());
        case 2 -> {
          for (int i = 1; i <= overview.students.size(); i++) {
            System.out.print("[" + i + "] - ");
            System.out.println(overview.students.get(i - 1).getName());
          }
          System.out.println("Type in the index of a student");
          int index = in.nextInt();
          System.out.println("Exercises completed by student: " + overview.students.get(index - 1).getNumExercises());
        }
        case 3 -> {
          for (int i = 1; i <= overview.students.size(); i++) {
            System.out.print("[" + i + "] - ");
            System.out.println(overview.students.get(i - 1));
          }
          System.out.println("Type in the index of a student");
          int indexStudent = in.nextInt() - 1;
          System.out.println("Type in the amount you want to increase");
          int amount = in.nextInt();
          Student e = overview.students.get(indexStudent);
          overview.increaseNumExercisesStudent(e, amount);
        }
        case 4 -> {
          System.out.println("Type in name");
          String name = in.next();
          System.out.println("Type in number of exercises");
          int numExercises = in.nextInt();
          overview.registerStudent(name, numExercises);
        }
      }
    }

}
