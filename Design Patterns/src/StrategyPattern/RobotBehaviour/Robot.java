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
public class Robot {
    IBehavior behavior;
    String name ;

    public Robot(String name) {
        this.name = name;
    }
    public void setBehavior(IBehavior behavior){
        this.behavior = behavior;
    }
    public IBehavior getBehavior(IBehavior behavior){
           return behavior;
    }
    public void move()
    {
        System.out.println(this.name + ": Based on current position" +"the behaviour object decide the next move:");
        int command =behavior.moveCommand();
        System.out.println("\tThe result returned by behaviour object " +
					"is sent to the movement mechanisms " + 
					" for the robot '"  + this.name + "'");
	
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
