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
public class GrillOrder implements Order{
    private Cook cook ;

    public GrillOrder(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.cookGrill();
    }

    @Override
    public void cancel() {
        cook.cancelOrder();
    }
    
}
