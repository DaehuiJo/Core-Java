/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arryList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 *
 * @author surpr
 */
public class EnumerationExample {
    public static void main(String[] args) {
        
        //Create an ArrayList object
        ArrayList<String> arrayList =  new ArrayList<String>();
        
        //Add element to ArrayList
        arrayList.add("C");
        arrayList.add("C++");
        arrayList.add("Java");
        arrayList.add("Dotnet");
        arrayList.add("Perl");
        
        //Get the Enumeraiton object
        Enumeration<String> e = Collections.enumeration(arrayList); //enumerate: 열거하다.
        
        //Enumerate through the ArrayList elemnets
        System.out.println("ArratList elements: ");
        while(e.hasMoreElements()){
            System.out.print(e.nextElement()+" ");
        }
    }
}
