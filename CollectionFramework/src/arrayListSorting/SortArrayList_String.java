/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListSorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author surpr
 */
public class SortArrayList_String {
    public static void main(String[] args) {
        ArrayList<String> listOfCountries = new ArrayList<String>();
        listOfCountries.add("India");
        listOfCountries.add("US");
        listOfCountries.add("China");
        listOfCountries.add("Denamrk");
        
        //unSorted List
        System.out.println("*** Before Sorting ***");
        for(String counter: listOfCountries){
            System.out.print(counter+" ");
        }
        
        //Sort statement
        Collections.sort(listOfCountries);
        System.out.println("");
        
        //Sorted List
        System.out.println("*** After Sorting ***");
        for(String counter: listOfCountries){
            System.out.print(counter+" ");
        }
    }
}
