/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern.RobotBehaviour;

/**
 *
 * @author Dell
 */
public class AgressiveBehavior implements IBehavior{

    @Override
    public int moveCommand() {
        System.out.println("Attack another");
        return 1;
    }
    
}
