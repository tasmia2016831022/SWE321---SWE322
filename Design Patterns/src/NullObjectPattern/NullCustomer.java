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
public class NullCustomer extends AbstarctCustomer {

     @Override
   public String getname() {
      return "Not Available in Customer Database";
   }

   @Override
   public boolean isnil() {
      return true;
   }

}
