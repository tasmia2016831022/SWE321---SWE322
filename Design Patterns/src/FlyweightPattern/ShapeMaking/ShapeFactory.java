/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlyweightPattern.ShapeMaking;

import java.util.HashMap;

/**
 *
 * @author Dell
 */
public class ShapeFactory {
    private static final HashMap circleMap = new HashMap();
    
    public static Shape getCircle(String color)
    {
        Circle circle = (Circle)circleMap.get(color);
        
        if(circle==null)
        {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Create "+color);
           
        }
        return circle;
    }
}
