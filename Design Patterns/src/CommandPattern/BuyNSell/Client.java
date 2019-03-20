/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern.BuyNSell;

/**
 *
 * @author Dell
 */
public class Client {
    public static void main(String[] args) {
        
        Waiter waiter = new Waiter();
        Cook cook = new Cook();
        
        SoupOrder soupOrder = new SoupOrder(cook);
        GrillOrder grillOrder = new GrillOrder(cook);
        
        waiter.setCommand(soupOrder);
        waiter.done();
        
        waiter.setCommand(grillOrder);
        waiter.done();
        
        waiter.undo();
       
    }
}
