/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NullObjectPattern;

/**
 *
 * @author Dell
 */
public class DriverClass {
    public static void main(String[] args) {

      AbstarctCustomer customer1 = CustomerFactory.getCustomer("Rob");
      AbstarctCustomer customer2 = CustomerFactory.getCustomer("Bob");
      AbstarctCustomer customer3 = CustomerFactory.getCustomer("Julie");
      AbstarctCustomer customer4 = CustomerFactory.getCustomer("Laura");

      System.out.println("Customers");
      System.out.println(customer1.getname());
      System.out.println(customer2.getname());
      System.out.println(customer3.getname());
      System.out.println(customer4.getname());
   }
}
