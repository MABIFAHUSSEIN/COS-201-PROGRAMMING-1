import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Display results formatted to two decimal places
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);

        // Check if division by zero occurs
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.printf("Quotient: %.2f%n", quotient);
        } else {
            System.out.println("Division is undefined for a zero divisor.");
        }

        scanner.close();
    }
}
