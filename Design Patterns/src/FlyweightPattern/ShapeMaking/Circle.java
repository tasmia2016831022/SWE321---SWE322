/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlyweightPattern.ShapeMaking;

/**
 *
 * @author Dell
 */
public class Circle implements Shape{
    private int x,y;
    private int rad;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }
    
    

    @Override
    public void draw() {
        System.out.println(color+" "+x+" "+y+" "+rad);
    }
    
}
