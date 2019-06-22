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
public class RealImage implements Image{
    
    private String filenameString;

    public RealImage(String filenameString) {
        this.filenameString = filenameString;
        loadFromDisk(filenameString);
    }
    
    
    @Override
    public void display() {
        System.out.println("dispaly real "+filenameString);
        }
    public void loadFromDisk(String filenameString)
    {
        System.out.println("Loading "+filenameString);
    }
    
}
