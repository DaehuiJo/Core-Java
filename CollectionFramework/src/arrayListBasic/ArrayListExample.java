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
public class ArrayListExample {
    
    public static void main(String[] args) { //main method shortCut: psvm + Tab_Key
        /* declation ArrayLIst of String type */
        ArrayList<String> obj = new ArrayList<String>(); //import short cut: ctrl + shit + i
        
        /* Add String type element into ArrayList */
        obj.add("Ajeet");
        obj.add("Harry");
        obj.add("Chaitanya");
        obj.add("Steve");
        obj.add("Anuj");
        
        /* Displaying element of ArrayList */
        System.out.println("Currently the ArrayList has flowing elements: "+obj); //sout + Tab_key
        
        /* Add element at the given index */
        obj.add(0, "Rahul");
        obj.add(1, "Justin");
        
        /* Remove elements from ArrayList */
        obj.remove("Chaitanya"); //directly inputed data
        obj.remove(3); // indexing number
        System.out.println("Current ArrayList is: "+obj);
    }
}
