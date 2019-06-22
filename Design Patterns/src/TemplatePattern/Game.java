/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePattern;

/**
 *
 * @author Dell
 */
public abstract class Game {
    abstract void initialize();
    abstract void start();
    abstract void end();
    
    public  final void play(){
        initialize();
        start();
        end();
    }
    
}
