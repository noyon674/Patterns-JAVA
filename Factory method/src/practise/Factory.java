package practise;

public class Factory {
    public Food getFood(String name){
        if(name.equals("Cake")){
            return new Cake();
        }
        else
            return new Pizza();
    }
}
