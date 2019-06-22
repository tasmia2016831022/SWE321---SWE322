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
public class DVD implements Show{

    @Override
    public void showOn() {
        System.out.println("DVD on");
    }

    @Override
    public void showOff() {
        System.out.println("DVD off");
    }
    
}
