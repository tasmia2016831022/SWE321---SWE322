/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorPattern.NameList;

/**
 *
 * @author Dell
 */
public class IteratorPatternDemo {
    
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        
        for(Iterator it = nameRepository.getIterator();it.hasNext();)
        {
            String name = (String)it.next();
            System.out.println("Name :"+name);
        }
    }
    
}
