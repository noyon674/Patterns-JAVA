package adaptarmethod;

public class Adapter implements IphoneCharger{
    NokiaNote nokia;
    public Adapter(NokiaNote phone){
        this.nokia = phone;
    }
    
    @Override
    public void IphonePlug(){
        nokia.NokiaPlug();
    }
}
