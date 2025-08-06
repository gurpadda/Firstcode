package Aug05;

public class SMSNotifier implements Notifier{
    @Override
    public void notifyUser(String message) {
        System.out.println("SMS Notification" +message);
    }
}
