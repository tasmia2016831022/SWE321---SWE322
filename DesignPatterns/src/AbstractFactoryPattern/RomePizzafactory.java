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
public class RomePizzafactory implements AbstractPizzaFactory{

    @Override
    public IVegetablePizza createVegetablePizza() {
        return new RomeVegetablePizza(" romeveg ");
    }

    @Override
    public IMeatPizza createMeatPizza() {
        return  new RomeMeatPizza(" romemeat ");
    }

    
    
}
