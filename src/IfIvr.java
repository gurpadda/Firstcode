import java.util.Scanner;

public class IfIvr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("Welcome to Fido  Customer Service!");
        System.out.println("Please select an option:");
        System.out.println("1. Account Information");
        System.out.println("2. Technical Support");
        System.out.println("3. Billing");
        System.out.println("4. Speak to a Representative");
        System.out.println("5. Exit");
        System.out.println("*******************************");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Please enter your Fido Account number to access further information");
        } else if (choice == 2) {
            System.out.println("Please wait one of technical staff will contact you");
        } else if (choice == 3) {
            System.out.println("Please wait while your billing information is processed");
        } else if (choice == 4) {
            System.out.println("Please  wait one of customer representative will pick your call");
        } else if (choice == 5) {
            System.out.println("Thank you for using Fido  Customer Service. Goodbye!");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        
    }
}

