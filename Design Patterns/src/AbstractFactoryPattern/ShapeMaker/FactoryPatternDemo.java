/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern.ShapeMaker;

/**
 *
 * @author Dell
 */
public class FactoryPatternDemo {
    public static void main(String[] args) { 
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();
         Shape shape2= shapeFactory.getShape("Rectangle");
        shape2.draw();
        
         AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory1.getShape("Square");
        shape3.draw();
         Shape shape4= shapeFactory1.getShape("Rectangle");
        shape4.draw();
         
    }
    
}
