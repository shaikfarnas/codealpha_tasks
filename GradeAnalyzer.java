import java.util.Scanner;

public class GradeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create an array to store the grades
        int[] grades = new int[numStudents];

        // Prompt the user to enter grades for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Enter the grade for student %d: ", i + 1);
            grades[i] = scanner.nextInt();
        }

        // Calculate the average grade
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / numStudents;

        // Find the highest grade
        int highest = grades[0];
        for (int i = 1; i < numStudents; i++) {
            if (grades[i] > highest) {
                highest = grades[i];
            }
        }

        // Find the lowest grade
        int lowest = grades[0];
        for (int i = 1; i < numStudents; i++) {
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        // Output the results
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        // Close the scanner
        scanner.close();
    }
}

