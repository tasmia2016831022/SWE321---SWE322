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

///Driver Class

public class Client {
    public static void main(String[] args) {
        AbstractPizzaFactory pizzaFactoy1 = FactoryMaker.getFactoy("rome");
        IMeatPizza iMeatPizzaRome = pizzaFactoy1.createMeatPizza();
        IVegetablePizza iVegetablePizzaRome = pizzaFactoy1.createVegetablePizza();
        iVegetablePizzaRome.createDow();
        iVegetablePizzaRome.createTopping();
        
        AbstractPizzaFactory pizzaFactoy2 = FactoryMaker.getFactoy("milan");
        IMeatPizza iMeatPizzaMilan = pizzaFactoy2.createMeatPizza();
        IVegetablePizza iVegetablePizzaMilan = pizzaFactoy2.createVegetablePizza();
    }
}
