/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern.LightNFan;

/**
 *
 * @author Dell
 */
public class FanOff implements Functionality{
    
    Fan fan;

    public FanOff(Fan fan) {
        this.fan = fan;
    }
    
    

    @Override
    public void execucte() {
        fan.SpeedUp();
    }

    @Override
    public void undo() {
        fan.SpeedDown();
    }
    
}
