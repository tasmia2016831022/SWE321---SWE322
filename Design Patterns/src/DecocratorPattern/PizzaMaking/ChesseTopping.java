/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecocratorPattern.PizzaMaking;

/**
 *
 * @author Dell
 */
public class ChesseTopping extends PizzaDecorator{
    
    public ChesseTopping(Ingrdients ingrdients) {
        super(ingrdients);
    }
    public void use()
    {
        super.use();
        System.out.println("Cheese Topping");
    }
    
}
