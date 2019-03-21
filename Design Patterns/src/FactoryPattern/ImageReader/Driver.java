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
public class Driver {
    public static void main(String[] args) {
        DecodedImage decodedImage;
        
        ImageReader reader = null;
        
        String image = "image.gif";
      String format = image.substring(image.indexOf('.') + 1, (image.length()));
      
      if (format.equals("gif")) {
            reader = new GIFReader(image);
        }
        if (format.equals("jpeg")) {
            reader = new JpegReader(image);
        }

        decodedImage = reader.getDecodedImage();

        System.out.println(decodedImage);
    }
}
