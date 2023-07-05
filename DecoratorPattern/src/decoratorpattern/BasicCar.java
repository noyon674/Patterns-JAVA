package decoratorpattern;

public class BasicCar implements Car{
    
    @Override
    public void design(){
        System.out.print("Basic Car Design.");
    }
}