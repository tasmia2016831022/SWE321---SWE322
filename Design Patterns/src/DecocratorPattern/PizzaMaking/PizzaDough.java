/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecocratorPattern.PizzaMaking;

/**
 *
 * @author Dell
 */
public class PizzaDough implements Ingrdients{
    String doughTypeString;

    public PizzaDough(String doughTypeString) {
        this.doughTypeString = doughTypeString;
    }

    @Override
    public void use() {
        System.out.println("DoughType: "+doughTypeString);
    }
    
}
