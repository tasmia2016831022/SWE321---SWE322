/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento.StateRestore;

/**
 *
 * @author Dell
 */
public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        
        originator.setState("State 1");
        originator.setState("State 2");
        careTaker.add(originator.saveStateToMemento());
        
        originator.setState("State 3");
        careTaker.add(originator.saveStateToMemento());
        
        System.out.println("Current "+originator.getState());
        
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("1st "+originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("2nd "+originator.getState());
    }

}
