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
public class Driver {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println("");
        game = new Foot();
        game.play();
    }
}
