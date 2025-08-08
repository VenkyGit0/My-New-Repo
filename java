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
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) { // Check if the number is divisible by 2
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        input.close();
    }
}
