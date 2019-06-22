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
public class StoreItemIterator implements StoreInterface{
    
    ArrayList<ProductItems>products;
    int position =0;

    public StoreItemIterator(ArrayList<ProductItems> products) {
        this.products = products;
    }
    

    @Override
    public boolean hasnext() {
        if(position>=products.size())
        {
            return false;
        }
        else
            return true;
    }

    @Override
    public Object next() {
        ProductItems productItems = products.get(position);
        position = position+1;
        return productItems;
    }
    
}
