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
public class Driver {
    public static void main(String[] args) {
        Robot r1 = new Robot("Ribo");
        Robot r2 = new Robot("Siri");
        Robot r3 = new Robot("Miso");
        
        r1.setBehavior(new AgressiveBehavior());
        r2.setBehavior(new DefenseBehaviour());
        r3.setBehavior(new NormalBehavior());
        
        r1.move();
        r2.move();
        r3.move();
        
    }
}
