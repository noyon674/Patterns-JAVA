package decoratorpattern;

public class Person {
    public static void main(String[] args) {
        System.out.println("////////////////////Basic Car");
        BasicCar basic = new BasicCar();
        basic.design();
        
        System.out.println("\n//////////////////Passenger + basic Car");
        Car pCar = new PassengerCar(basic);
        pCar.design();
        
        System.out.println("\n////////////////luxary + Basic car");
        Car lCar = new LuxaryCar(basic);
        lCar.design();
        
        System.out.println("\n//////////////////Luxary + passenger + basic Car");
        Car lpCar = new LuxaryCar(pCar);
        lpCar.design();
        
    }
}
