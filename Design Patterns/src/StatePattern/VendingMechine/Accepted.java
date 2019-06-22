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
public class Accepted implements State{

    public Accepted() {
    }

    @Override
    public void insert(Vendor wrapper) {
        wrapper.setState(new dispatch());
        System.out.println("Deal done ");
        wrapper.insert();
    }
    
}
