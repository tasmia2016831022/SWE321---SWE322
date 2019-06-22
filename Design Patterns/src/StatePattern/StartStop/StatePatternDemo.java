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
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        
        StartState startState = new StartState();
        startState.doaction(context);
        System.out.println(context.getState().toString());
        
        StopState stopState = new StopState();
        stopState.doaction(context);
        System.out.println(context.getState().toString());
    }
}
