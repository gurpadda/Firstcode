package July26;

public class StringTest {
    public static void main(String[] args) {
        String s1 =    "  Hello "  ;
        String s2 = "Gurjit";
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println((s1.compareTo(s2)));
        System.out.println(s1.indexOf("o"));
        System.out.println((s1.trim() ));
        String newString =s1.concat("folks");
        System.out.println(newString);
        //System.out.println(s1.endsWith("you"));
        System.out.println(s1.lastIndexOf(s1));

    }
}
