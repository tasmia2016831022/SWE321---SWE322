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
public class Cricket extends Game{

    @Override
    void initialize() {
        System.out.println("Ready C");
         }

    @Override
    void start() {
        System.out.println("Start C");
         }

    @Override
    void end() {
        System.out.println("End C");
        }
    
}
