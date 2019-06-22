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
public class ObjectOperation {
    private static ObjectOperation objectOperation = new ObjectOperation();

    private ObjectOperation() {
    }
    
    public static ObjectOperation getInstance()
    {
        return objectOperation;
    }
    public  void showMesaage()
    {
        System.out.println("Object Operation Created ");
    }
    
    
}
