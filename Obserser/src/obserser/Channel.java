package obserser;
import java.util.*;

public class Channel{
    private String title;
    private List<Subscriber> subs = new ArrayList<>();
    
    public void register(Subscriber sub){
        subs.add(sub);
    }
    public void unregister(Subscriber sub){
        subs.remove(sub);
    }
    
    public void notifyUser(){
        for(Subscriber sub: subs){
            sub.update();
        }
    }
    
    public void upload(String title){
        this.title = title;
        notifyUser();
    }
}