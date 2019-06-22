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
public class FanOn implements Functionality{
    Fan fan;

    public FanOn(Fan fan) {
        this.fan = fan;
    }
    

    @Override
    public void execucte() {
        fan.SpeedDown();
          }

    @Override
    public void undo() {
        fan.SpeedUp();
      }
    
    
}
