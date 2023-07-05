/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise;

/**
 *
 * @author Prethun
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Food food = factory.getFood("Cake");
        System.out.println(food.getType());
    }

}
