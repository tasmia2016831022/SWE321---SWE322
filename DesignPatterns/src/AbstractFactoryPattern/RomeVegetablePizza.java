/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

/**
 *
 * @author Dell
 */
public class RomeVegetablePizza implements IVegetablePizza{

    public RomeVegetablePizza(String arg) {
        System.out.println("Hello rome vege!!"+arg);
    }    

    @Override
    public void createDow() {
        System.out.println("This is vegetable pizza dow !! at Rome");
    }

    @Override
    public void createTopping() {
        System.out.println("This is vegetable pizza topping !! at Rome");
    }
    
}
