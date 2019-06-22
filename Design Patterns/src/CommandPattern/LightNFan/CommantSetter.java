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
public class CommantSetter {
    Functionality slot;

    public CommantSetter() {
    }
    
    
    
    public void setCommand(Functionality slot)
    {
        this.slot = slot;
    }
    public void ButtonPress()
    {
        slot.execucte();
    }
    public void undoPress()
    {
        slot.undo();
    }
    
}
