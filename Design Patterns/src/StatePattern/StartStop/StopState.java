/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern.StartStop;

/**
 *
 * @author Dell
 */
public class StopState implements State{

    public void doaction(Context context) {
      System.out.println("Player is in stop state");
      context.setState(this);	
   }

   public String toString(){
      return "Stop State";
   }
    
}
