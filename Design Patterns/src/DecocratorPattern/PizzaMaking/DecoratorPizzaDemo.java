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
public class DecoratorPizzaDemo {
    public static void main(String[] args) {
        Ingrdients ingrdients = new MeatToping(new ChesseTopping(new PizzaDough("Crust")));
        ingrdients.use();
    }
}
