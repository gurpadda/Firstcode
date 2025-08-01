package Assignments;

public class FindMinimum
{

        public static void main(String[] args) {
            int[] arr = {5, 2, 7, 4, 8, 1, 9, 6};
            int min = arr[0]; // Assume the first element is the minimum

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i]; // Update min if a smaller value is found
                }
            }

            System.out.println("The minimum value in the array is: " + min);
        }
    }


