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
public class ScrollbarDecorator extends Decorator{
    
    public ScrollbarDecorator(Widget widget) {
        super(widget);
    }
    
    public void draw(){
        super.draw();
        System.out.println("Scrollbar Decorator");
    }
    
}
