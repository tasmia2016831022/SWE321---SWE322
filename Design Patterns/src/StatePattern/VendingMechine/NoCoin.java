/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern.VendingMechine;

/**
 *
 * @author Dell
 */
public class NoCoin implements State{

    public NoCoin() {
    }

    
    @Override
    public void insert(Vendor wrapper) {
        wrapper.setState(new InsertCoin());
        System.out.println("Coin inserted ");
        wrapper.insert();
    }
    
}
