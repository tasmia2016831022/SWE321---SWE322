/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorPattern;

/**
 *
 * @author Dell
 */
public class Store {
    ProductContains productContains;

    public Store(ProductContains productContains) {
        this.productContains = productContains;
    }

    public void printItems(){
        StoreInterface storeInterface = productContains.createStoreInterface();
        System.out.println("Products");
        printItems(storeInterface);
    }

    private void printItems(StoreInterface storeInterface) {
        while (storeInterface.hasnext()) {
            ProductItems productItems = (ProductItems) storeInterface.next();
            System.out.print(productItems.getProductName()+" --- ");
            System.out.print(productItems.getProductDescription()+" --- ");
            System.out.print(productItems.getProductType()+" --- ");
            System.out.println(productItems.getProductPrice());
            
        }
    }
    
}
