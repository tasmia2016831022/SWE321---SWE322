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
public class RomeMeatPizza implements IMeatPizza{

    public RomeMeatPizza(String arg) {
        System.out.println("Hi meat lovers at Rome !!"+arg);
        
    }

    @Override
    public void createDow() {
        System.out.println("This is meat pizza dow at Rome!!");
    }

    @Override
    public void createTopping() {
        System.out.println("This is meat pizza topping at Rome !!");
    }
    
}
