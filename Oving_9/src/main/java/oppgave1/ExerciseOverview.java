package oppgave1;

import java.util.*;
public class ExerciseOverview {
    public ArrayList<Student> students = new ArrayList<>();
    private static int numStudents = 0;

    public static int getNumStudents() {
        return numStudents;
    }

    public int getNumExercisesStudent(Student student) {
        return student.getNumExercises();
    }

    public void registerStudent(String name, int numExercises) {
        boolean exists = students.stream().anyMatch(student -> student.getName().equals(name));

        if (exists) {
            System.out.println("Student with this name already exists");
        } else {
            Student newStudent = new Student(name, numExercises);
            students.add(newStudent);
            ExerciseOverview.numStudents++;
        }
    }

    public void increaseNumExercisesStudent(Student student, int amount) {
        int numExercisesBefore = student.getNumExercises();
        student.increaseNumExercises(amount);

        System.out.printf("Amount of exercises increased successfully from %d to %d \n",
                numExercisesBefore, numExercisesBefore + amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Number of students: ").append(numStudents).append("\n\n");
        sb.append("Students: \n");

        if (students != null) {
            for (int i = 0; i < students.size(); i++) {
                sb.append(students.get(i).toString());
                if (i < students.size() - 1) {  // Not the last item
                    sb.append("\n");
                }
            }
        }

        return sb.toString();
    }
}
