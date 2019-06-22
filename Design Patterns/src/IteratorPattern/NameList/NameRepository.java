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
public class NameRepository implements Container {

    public String names[] = {"amu", "miti", "juli", "sam"};

    @Override
    public Iterator getIterator() {
        return new NameContainer();
    }

    private  class NameContainer implements Iterator {

        int index;

        public NameContainer() {
        }

        @Override
        public boolean hasNext() {

            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

}
