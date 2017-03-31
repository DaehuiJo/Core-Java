/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListBasic;

import java.util.ArrayList;

/**
 *
 * @author surpr
 */
public class InitializationExample3 {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<String>();
        books.add("Java Book1");
        books.add("Java Book2");
        books.add("Java Book3");
        
        System.out.println("Books stored in ArrayList are: "+books);
    }
}
