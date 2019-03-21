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
public class GIFReader implements ImageReader{
 
    private DecodedImage decodedImage;

    public GIFReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodedImage() {
        return decodedImage;
    }
    
}
