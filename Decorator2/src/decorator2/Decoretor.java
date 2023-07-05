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
public abstract class Decoretor implements Car{
    private Car car;
    public Decoretor(Car car){
        this.car = car;
    }
    
    public void Design(){
        car.Design();
    }
}
