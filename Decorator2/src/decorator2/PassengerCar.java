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
public class PassengerCar extends Decoretor{
    public PassengerCar(Car car){
        super(car);
    }
    
    public void Design(){
        super.Design();
        System.out.println("passenger Design Car.");
    }
}
