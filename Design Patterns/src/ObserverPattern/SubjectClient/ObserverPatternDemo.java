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
public class ObserverPatternDemo {
    public static void main(String[] args) {
         Subject subject = new Subject();
         
         new ClientA(subject);
         new ClientB(subject);
         
         System.out.println("change 1");
         subject.setState(1);
         System.out.println("Change 2");
         subject.setState(2);
    }
    
}
