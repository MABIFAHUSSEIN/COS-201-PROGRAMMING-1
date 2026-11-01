import java.util.Scanner;

/**
 * Practical 3: AverageCalculator
 * Course: COS 201 - Computer Programming I
 * Description: Reads student name and 3 exam scores, validates each score, and computes total & average.
 */
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read student name using nextLine()
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        // Read three exam scores as doubles
        System.out.print("Enter score 1: ");
        double score1 = scanner.nextDouble();

        System.out.print("Enter score 2: ");
        double score2 = scanner.nextDouble();

        System.out.print("Enter score 3: ");
        double score3 = scanner.nextDouble();

        // Validate that each score is between 0 and 100 inclusive
        if (score1 < 0 || score1 > 100 || score2 < 0 || score2 > 100 || score3 < 0 || score3 > 100) {
            System.out.println("Error: Each score must be between 0 and 100.");
        } else {
            double total = score1 + score2 + score3;
            double average = total / 3.0;

            // Output student results summary
            System.out.println("--- STUDENT RESULT ---");
            System.out.println("Student: " + studentName);
            System.out.printf("Total: %.2f%n", total);
            System.out.printf("Average: %.2f%n", average);
        }

        scanner.close();
    }
}
