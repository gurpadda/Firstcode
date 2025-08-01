package July29;

public class UserLogin {
    private String username;
    private  String password;

    public UserLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public  void loginUser(String username,String  password)
    {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("user is authenticate");
            System.out.println("welcome to app");
        }
        else {
            System.out.println("invalid");

        }
        }
    }

