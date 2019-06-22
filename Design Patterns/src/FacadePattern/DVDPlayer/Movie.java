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
public class Movie {
   private Show lightShow;
   private Show dvdShow;
   private Show projectorShow;

    public Movie() {
       lightShow = new Light();
       dvdShow = new DVD();
       projectorShow = new Projector();
    }
   
    public void playMovie()
    {
        lightShow.showOff();
        dvdShow.showOn();
        projectorShow.showOn();
        System.out.println("Start");
    }
    
    public void stopMovie()
    {
        projectorShow.showOff();
        dvdShow.showOff();
        lightShow.showOn();
        System.out.println("Stop");
        
    }

    
    
    
    
}
