import java.util.Scanner;
import java.util.Arrays;

public class GradesStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[] grades = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            if (grade < 0 || grade > 100) {
                throw new IllegalArgumentException("Grade must be between 0 and 100");
            }
            grades[i] = grade;
        }


        System.out.print("The grades are: [");
        for (int i = 0; i < grades.length; i++) {

            if (i != grades.length - 1) {
                System.out.print(grades[i] + ", ");
            }
            else{
                System.out.print(grades[i]);
            }
        }
        System.out.println("]");

        int sum = 0;
        for (int i = 0; i < numberOfStudents; i++){
            sum += grades[i];
        }
        double average = (double)sum / numberOfStudents;
        System.out.println("The average is: " + average);

        int[] sortedGrades = Arrays.copyOf(grades, numberOfStudents);
        Arrays.sort(sortedGrades);

        int min = sortedGrades[0];
        int max = sortedGrades[numberOfStudents-1];
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);

        double median = 0;
        if (numberOfStudents % 2 == 0){
            median = (sortedGrades[numberOfStudents / 2 - 1] + sortedGrades[numberOfStudents / 2]) / 2.0;
        }
        else{
            median = sortedGrades[numberOfStudents / 2];
        }
        System.out.println("The median is: " + median);
    }
}