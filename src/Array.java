public class Array {

        public static void main(String[] args) {
            int[] arr = {90, 89, 2, 67, 34, 67, 23};
            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println("The largest number in the array is: " + max);
        }
    }


