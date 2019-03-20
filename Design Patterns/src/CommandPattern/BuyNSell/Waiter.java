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
public class Waiter {
    Order order;

    public Waiter() {
    }
    
    public void setCommand(Order order)
    {
        this.order = order;
    }
    public void done()
    {
        order.execute();
    }
    public void undo()
    {
        order.cancel();
    }
}
