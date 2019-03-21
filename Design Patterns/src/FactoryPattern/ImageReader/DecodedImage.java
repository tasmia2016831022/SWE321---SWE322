/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern.ImageReader;

/**
 *
 * @author Dell
 */
public class DecodedImage {
    String Image ;

    public DecodedImage(String Image) {
        this.Image = Image;
    }
    public String toString(){
        return Image+" is Decoded";
    }
}
