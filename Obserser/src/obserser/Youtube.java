package obserser;

public class Youtube {
    public static void main(String[] args) {
        Channel pk = new Channel();
        
        Subscriber s1 = new Subscriber("Mithun");
        Subscriber s2 = new Subscriber("Noyon");
        Subscriber s3 = new Subscriber("Sajib");
        
        pk.register(s1);
        pk.register(s2);
        pk.register(s3);
        
        pk.upload("lol");
    }
}
