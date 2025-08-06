package Aug05;

public class EmailNotifier implements Notifier {
    @Override
    public void notifyUser(String message) {
        System.out.println("sending email notification " +message);

    }
}
