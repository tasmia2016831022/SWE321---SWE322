/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyPattern.ImageShow;

/**
 *
 * @author Dell
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String filenameString;

    public ProxyImage(String filenameString) {
        this.filenameString = filenameString;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filenameString);
        }
        realImage.display();
    }

}
