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
public class MilanPizzaFactory implements AbstractPizzaFactory{

    @Override
    public IVegetablePizza createVegetablePizza() {
        return new MilanVegetablePizza(" milanveg ");
    }

    @Override
    public IMeatPizza createMeatPizza() {
           return new MilanMeatPizza(" milanmeat ");
    }
    
}
