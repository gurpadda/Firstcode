import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value of x:");
        int x = scanner.nextInt();
        System.out.println("Enter Value of y:");
        int y = scanner.nextInt();
        System.out.println("Enter Value of z:");
        int z = scanner.nextInt();
        int largest;
        if (x>=y && x>=z)
        {
            largest = x;
        }
            else if(y>=x && y>=z){
            largest = y;
        }
                else {
                    largest = z;
        }
        System.out.println("largest number is:" + largest);
            }
        }


