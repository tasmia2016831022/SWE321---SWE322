/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern.AdminClient;

/**
 *
 * @author Dell
 */
public class Admin implements Listener{

    @Override
    public void notification() {
        System.out.println("Admin notification");
    }
    
}
