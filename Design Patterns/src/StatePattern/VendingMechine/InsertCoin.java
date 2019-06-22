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
public class InsertCoin implements State {

    public InsertCoin() {
    }

    @Override
    public void insert(Vendor wrapper) {
        wrapper.setState(new haveCoin());
        System.out.println("Mechine have coin ");
        wrapper.insert();
    }
    
}
