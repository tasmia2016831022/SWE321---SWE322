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
public class Vendor {
    private State currentState;

    public Vendor() {
        currentState = new NoCoin();
    }
    
    public void setState(State s){
        currentState = s;
    }
    public void insert(){
        currentState.insert(this);
    }

}
