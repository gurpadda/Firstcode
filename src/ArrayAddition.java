public class ArrayAddition {
    public static void main(String[] args) {


        int[][] arr = {{10, 20, 30}, {10, 20, 30}, {10, 20, 30}};
        int[][] arr2 = {{30, 20, 10}, {30, 20, 10}, {30, 20, 10}};
        int[][] sum  = new int[3][3];
for (int i = 0; i< 3 ; i++) {
    for (int j = 0; j < 3; j++){
        sum[i][j] = arr[i][j] + arr2[i][j];

}}
            System.out.println("Sum of two matrices is: ");

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 3; j++){

                    System.out.println("sum is" + sum[i][j]);

            }
                System.out.println();}


    }}