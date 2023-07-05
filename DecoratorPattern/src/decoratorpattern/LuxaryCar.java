package decoratorpattern;

public class LuxaryCar extends Decorator{
    public LuxaryCar(Car car){
        super(car);
    }
    
    @Override
    public void design(){
        super.design();
        System.out.print(" Luxary Car design.");
    }
}
