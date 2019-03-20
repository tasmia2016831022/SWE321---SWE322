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
public class FactoryMaker {
    private static AbstractPizzaFactory pizzaFactoy =null;
    static AbstractPizzaFactory getFactoy(String choice)
    {
        if(choice.equals("rome"))
        {
            pizzaFactoy = new RomePizzafactory();
        }
        else if(choice.equals("milan"))
        {
            pizzaFactoy = new MilanPizzaFactory();
        }
        return pizzaFactoy;
    } 
}
