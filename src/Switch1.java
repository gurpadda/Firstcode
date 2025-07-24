import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {

        System.out.println("***********");
        System.out.println("1. Addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. divison");
        System.out.println("5. modulus");
        System.out.println("0 . exit");
        System.out.println("**************");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter your choice");
        int input = scanner.nextInt();
        System.out.println("Enter Value of x:");
        int x = scanner.nextInt();
        System.out.println("Enter Value of y:");
        int y = scanner.nextInt();
        int result;
        switch (input)
        {

            case 1:

                result=x+y;
                System.out.println(" Addition result is:" + result );
break;
            case 2:

                result=x-y;
                System.out.println(" Subtraction result is:" + result );
break;
            case 3:

                result=x*y;
                System.out.println(" multiplication result is:" + result );
                break;
            case 4:

                result=x/y;
                System.out.println(" Divison result is:" + result );
                break;
            case 5:

                result=x-y;
                System.out.println(" Modulus result is:" + result );
                break;
            default:
                System.out.println("exit");
break;



        }
    }
}
