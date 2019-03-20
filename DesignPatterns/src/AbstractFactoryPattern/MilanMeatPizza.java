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
public class MilanMeatPizza implements IMeatPizza{

    public MilanMeatPizza(String arg) {
        System.out.println("Hi meat lovers at Milan"+arg);
    }

     @Override
    public void createDow() {
        System.out.println("This is meat pizza dow at Milan!!");
    }

    @Override
    public void createTopping() {
        System.out.println("This is meat pizza topping at Milan !!");
    }
    
}
