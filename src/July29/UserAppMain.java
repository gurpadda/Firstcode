package July29;

public class UserAppMain {
    public static void main(String[] args) {
        UserLogin userLogin = new UserLogin("Test","Test12");
       // userLogin.loginUser("Test","Test123");
        System.out.println(userLogin.getUsername());
        //userLogin.setPassword("my pass");
       userLogin.loginUser("Test","Test12");

    }
}
