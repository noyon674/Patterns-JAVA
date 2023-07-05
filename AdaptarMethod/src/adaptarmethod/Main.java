package adaptarmethod;

public class Main {
    public static void main(String[] args) {
        NokiaNote nkAsha = new NokiaNote();
        nkAsha.NokiaPlug();
        
        Adapter Nokia = new Adapter(nkAsha);
        Nokia.IphonePlug();
    }
}
