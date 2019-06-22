/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern.SubjectClient;

/**
 *
 * @author Dell
 */
public class ClientB extends Observer{

    public ClientB(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    
    

    @Override
    public void update() {
        System.out.println("Client B update "+subject.getState());
         }
    
}
