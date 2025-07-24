import java.util.Scanner;

public class UserArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Define the size of the 2D array
            System.out.print("Enter the number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter the number of columns: ");
            int cols = sc.nextInt();

            int[][] array = new int[rows][cols];
int[][] array2 = new int[rows][cols];

            // Step 2: Input values into the 2D array
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    array[i][j] = sc.nextInt();
                }
            }

                    System.out.println("Enter the elements of the 2nd  array:");
                    for ( int i = 0; i < rows; i++) {
                        for ( int j = 0; j < cols; j++) {
                            System.out.print("Element [" + i + "][" + j + "]: ");
                    array2[i][j] = sc.nextInt();

                }
            }

            // Step 3: Display the 2D array
            System.out.println("The 2D array is:");
            for (  int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(array[i][j] + " ");
                    System.out.println((array2[i][j] +" "));
                }
                System.out.println();
            }
// Adding Two matrices
            int[][] sum = new int[rows][cols];
            for(int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sum[i][j] = array[i][j] + array2[i][j];
                }
            }
            // Displaying the result
            System.out.println("Sum of two matrices is: ");
            for(int[] row : sum) {
                for (int column : row) {
                    System.out.print(column + "    ");
                }
                System.out.println();
            }
            sc.close();
        }

    }


