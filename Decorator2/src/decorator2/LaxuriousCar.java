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
public class LaxuriousCar extends Decoretor{
    public LaxuriousCar(Car car){
        super(car);
    }
    
    public void Design(){
        System.out.println("");
        super.Design();
        System.out.println("Laxurious design Car.");
    }
}
