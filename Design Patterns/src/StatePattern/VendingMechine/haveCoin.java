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
public class haveCoin implements State{

    public haveCoin() {
    }

    @Override
    public void insert(Vendor wrapper) {
        wrapper.setState(new Accepted());
        System.out.println("Coin Accepted");
        wrapper.insert();
    }
    
}
