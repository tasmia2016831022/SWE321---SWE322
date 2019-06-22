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
public class NormalShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("Circle"))return new Circle();
        else if(shapeType.equalsIgnoreCase("Rectangle"))return new Rectangle();
        return null;
    }
    
}
