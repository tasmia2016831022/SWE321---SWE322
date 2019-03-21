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
public class MilanVegetablePizza implements IVegetablePizza{

    public MilanVegetablePizza(String arg) {
        System.out.println("Hello milan vege !!"+arg);
    }

    @Override
    public void createDow() {
        System.out.println("This is vegetable pizza dow !! at Milan");
    }

    @Override
    public void createTopping() {
        System.out.println("This is vegetable pizza topping !! at Milan");
    }
    
}
