package Aug05;

public class PushNotifier implements  Notifier{
    @Override
    public void notifyUser(String message) {
        System.out.println("Push Notification" +message);
    }
}
