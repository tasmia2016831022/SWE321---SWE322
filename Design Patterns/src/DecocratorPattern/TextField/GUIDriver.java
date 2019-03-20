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
public class GUIDriver {
    
    public static void main(String[] args) {
        Widget widget = new BorderDecorator(new BorderDecorator(new ScrollbarDecorator(new TextField(50, 40))));
        widget.draw();
    }
    
}
