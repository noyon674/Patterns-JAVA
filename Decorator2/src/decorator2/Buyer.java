/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator2;

/**
 *
 * @author Prethun
 */
public class Buyer {
    public static void main(String[] args) {
        BasicCar bCar = new BasicCar();
        bCar.Design();
        
        PassengerCar pCar = new PassengerCar(bCar);
        pCar.Design();
        
        LaxuriousCar lCar = new LaxuriousCar(pCar);
        lCar.Design();
    }
}
