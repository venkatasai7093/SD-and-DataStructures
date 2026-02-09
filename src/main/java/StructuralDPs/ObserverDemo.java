package StructuralDPs;

public class ObserverDemo {

    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();
        Observer s1=new Subscriber("Venkat");
        Observer s2=new Subscriber("Pritham");
        Observer s3=new Subscriber("Rakesh");

        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);

        channel.uploadVideo("Observer pattern in java");
        channel.unsubscribe(s2);

        channel.uploadVideo("API gateway");
    }
}
