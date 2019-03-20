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
public class ProductItems {
    String productName;
    String productDescription;
    String productType;
    double productPrice;

    public ProductItems(String productName, String productDescription, String productType, double productPrice) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productType = productType;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductType() {
        return productType;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
