adding new lines of java code is completely for testing perpose
import java.util.Scanner; // Import the Scanner class for input

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter first number: ");
        int num1 = input.nextInt(); // Read the first integer

        System.out.print("Enter second number: ");
        int num2 = input.nextInt(); // Read the second integer

        int sum = num1 + num2; // Calculate the sum
        System.out.println("Sum: " + sum); // Print the sum

        input.close(); // Close the scanner
    }
}
