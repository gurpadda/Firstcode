package Aug9;

public class Instagram implements  HybridSocialMedia,SocialMedia{
    @Override
    public void reels() {
        System.out.println("Can make reels on Instagram");
    }

    @Override
    public void memes() {
        System.out.println("Instagram has option for reels");

    }

    @Override
    public void uploadPicture() {
        System.out.println("on Instagram we can upload picture");

    }

    @Override
    public void makeConnections() {
        System.out.println("On instagram we can new friends");
    }

    @Override
    public void makePost() {
        System.out.println("we can post stories and thoughts on Instagram");
    }
}
