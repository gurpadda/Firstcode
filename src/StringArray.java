public class StringArray {

        public static void main(String[] args) {
            String s1 = "Pragra";
            String s2 = "";

            for (int i = s1.length() - 1; i >= 0; i--) {
                s2 += s1.charAt(i);
            }

            System.out.println("Reversed string: " + s2);
        }


    }

