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
public class ObserverMain {
    public static void main(String[] args) {
        NotificationSystem system = new NotificationSystem();
        system.register(new Client());
        system.register(new Admin());
        system.register(new Client());
        
        system.sendNotification();
    }
}
