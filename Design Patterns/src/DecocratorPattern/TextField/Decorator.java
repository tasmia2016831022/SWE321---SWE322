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
public class Decorator implements Widget{
    
    private Widget widget;

    public Decorator(Widget widget) {
        this.widget = widget;
    }

    @Override
    public void draw() {
        widget.draw();
    }
    
}
