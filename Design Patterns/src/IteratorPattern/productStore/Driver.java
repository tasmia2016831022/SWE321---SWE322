/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorPattern.productStore;

/**
 *
 * @author Dell
 */
public class Driver {
    public static void main(String[] args) {
        ProductContains productContains =new ProductContains();
        Store store = new Store(productContains);
        store.printItems();
    }
}
