import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize variables
        int factorial = 1;
        int i = 1;

        // Calculate factorial using while loop
        while (i <= number) {
            factorial *= i;
            i++;
        }

        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}
