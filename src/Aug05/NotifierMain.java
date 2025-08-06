package Aug05;

public class NotifierMain {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        Notifier notifier1 = new SMSNotifier();
        Notifier notifier3 = new PushNotifier();
        notifier.notifyUser("email ");
        notifier1.notifyUser("SMS");
        notifier3.notifyUser("Push");
    }
}

