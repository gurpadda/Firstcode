package Aug9;

public class Facebook implements EntertainmentSocialMedia,HybridSocialMedia,SocialMedia{
    @Override
    public void reels() {
        System.out.println("Facebook has reel option");
    }

    @Override
    public void memes() {
        System.out.println("Facebook has option to crete memes");
    }

    @Override
    public void uploadPicture() {
        System.out.println("Facebook we can upload picture");

    }

    @Override
    public void makeConnections() {
        System.out.println("On facebook can make new friends");

    }

    @Override
    public void makePost() {
        System.out.println("on Facebook can post content");

    }
}
