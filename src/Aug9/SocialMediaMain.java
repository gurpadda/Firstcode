package Aug9;

public class SocialMediaMain {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();

        System.out.println("****Facebook*****");
        facebook.makeConnections();
        facebook.makePost();
        facebook.reels();
        facebook.uploadPicture();
        facebook.memes();
        System.out.println("**** End of Facebook****");

        SnapChat snapChat = new SnapChat();
        System.out.println("******SnapChat****");
        snapChat.reels();
        snapChat.memes();
        System.out.println("***** End of Snapchat*****");

        Instagram instagram = new Instagram();
        System.out.println("*****Instagram****");
        instagram.makeConnections();
        instagram.memes();
        instagram.makePost();
        instagram.reels();
        instagram.uploadPicture();
        System.out.println("**** End of Instagram******");

    }
}
