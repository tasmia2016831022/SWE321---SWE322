/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 *
 * @author Dell
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject(); /// can only be instantiated within its class

    private SingleObject() {
        /// so that object cannot be instantiated
    }
    public static SingleObject getInstance() /// get the only object available
    {
        return instance;
    }

    public void showMessage() {
        System.out.println("Single Object Created");
    }

}
