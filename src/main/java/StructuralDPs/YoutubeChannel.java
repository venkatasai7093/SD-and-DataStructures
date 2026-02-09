package StructuralDPs;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    private List<Observer> subscribers = new ArrayList<>();
    @Override
    public void subscribe(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer o:subscribers){
            o.update(message);
        }
    }

    public void uploadVideo(String title){
        System.out.println("Channel uploaded with:"+title);
        notifyObservers("New Video Uploaded"+title);
    }
}
