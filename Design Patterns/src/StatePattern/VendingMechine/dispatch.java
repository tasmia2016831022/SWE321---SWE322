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
public class dispatch implements State{

    public dispatch() {
        
    }

    @Override
    public void insert(Vendor wrapper) {
        wrapper.setState(new NoCoin());
        System.out.println("No Coin Here ");
        //wrapper.insert();
    }
    
}
