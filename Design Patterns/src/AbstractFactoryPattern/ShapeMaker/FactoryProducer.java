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
public class FactoryProducer {
    public static AbstractFactory getFactory(boolean round){
        if(round)return new RoundFactory();
        else return new NormalShapeFactory();
    }
}
