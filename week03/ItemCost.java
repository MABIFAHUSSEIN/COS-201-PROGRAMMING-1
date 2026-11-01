import java.util.Scanner;

/**
 * Practical 3: ItemCost
 * Course: COS 201 - Computer Programming I
 * Description: Reads item details, consumes leftover newline after nextInt(), and prints purchase summary.
 */
public class ItemCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read item name using nextLine()
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        // Read quantity as int
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Handle leftover newline after nextInt
        scanner.nextLine();

        // Read unit price as double
        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        double totalCost = quantity * unitPrice;

        // Output formatted purchase summary
        System.out.println("--- PURCHASE SUMMARY ---");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Unit price: %.2f%n", unitPrice);
        System.out.printf("Total cost: %.2f%n", totalCost);

        scanner.close();
    }
}
