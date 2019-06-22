/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorPattern.productStore;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class ProductContains {
         ArrayList productItemsArrayList;
    public ProductContains() {
        productItemsArrayList = new ArrayList();
        addProduct("Fit", "Crispy and Tasty","Biscuit", 10.00);
        addProduct("Freash", "Full fat milk", "Dairy", 22.00);
        addProduct("Radhuni", "Refined spice ", "Consumer", 100.00);
    }
    
    public void addProduct(String productName, String productDescription, String productTypeString, double productPrice )
    {
        ProductItems productItems = new ProductItems(productName, productDescription, productTypeString, productPrice);
        productItemsArrayList.add(productItems);
    }
    public StoreInterface createStoreInterface()
    {
        return  new StoreItemIterator(productItemsArrayList);
    }

   
    
}
