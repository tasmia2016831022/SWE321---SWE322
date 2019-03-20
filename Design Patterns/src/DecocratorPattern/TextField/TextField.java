/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecocratorPattern.TextField;

/**
 *
 * @author Dell
 */
public class TextField implements Widget{
    
    private int width,height;

    public TextField(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Text Field  "+width+" "+height);
    }
    
}
