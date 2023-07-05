package obserser;

public class Subscriber {
    private String name;
    
    public Subscriber(String name){
        this.name = name;
    }
    
    public void update(){
        System.out.println("Hey "+name+"!New Video uploaded.");
    }
}
