/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePattern.DVDPlayer;

/**
 *
 * @author Dell
 */
public class Projector implements Show{

    @Override
    public void showOn() {
        System.out.println("Projector On");
    }

    @Override
    public void showOff() {
        System.out.println("Projector Off");
    }
    
}
