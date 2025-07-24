import java.util.Scanner;

public class IvrTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("*****************");
        System.out.println("Welcome to  Pembridge insurance company  IVR System!");
        System.out.println("Please select an option:");
        System.out.println("1. Broker account ");
        System.out.println("2. for underwriting");
        System.out.println("3. claim Services");
        System.out.println("4. broker connectivity");
        System.out.println("5. exit");
        System.out.println("********************");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("please provide broker company name.");
                break;
            case 2:
                System.out.println("Please provide email address to receive underwriting ");
                break;
            case 3:
                System.out.println("Please provide your claim number to process your request");
                break;
            case 4:
                System.out.println("Please provide Id");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }


    }
}
