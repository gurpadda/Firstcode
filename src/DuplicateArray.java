import java.util.Arrays;
public class DuplicateArray {



        public static void main(String[] args) {
            int[] array = {30, 20, 30, 4, 20, 5, 6, 30,60,60};
            Arrays.sort(array);
            System.out.println("Duplicates:");
            for (int i = 1; i < array.length; i++) {
                if (array[i] == array[i - 1]) {
                    System.out.println(array[i]);
                }
            }
        }
    }


