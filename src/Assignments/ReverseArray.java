package Assignments;

import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            int start = 0;
            int end = array.length - 1;

            while (start < end) {
                // Swap elements at start and end
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;

                // Move pointers
                start++;
                end--;
            }

            System.out.println("Reversed Array: " + Arrays.toString(array));
        }
    }


