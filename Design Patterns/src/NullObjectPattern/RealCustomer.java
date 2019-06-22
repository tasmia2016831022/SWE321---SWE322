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
public class RealCustomer extends AbstarctCustomer {

   public RealCustomer(String name) {
      this.name = name;		
   }
   
   @Override
   public String getname() {
      return name;
   }
   
   @Override
   public boolean isnil() {
      return false;
   }

}


