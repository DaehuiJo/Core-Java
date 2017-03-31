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
public class SortArrayList_Integer {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(11);
        arrayList.add(2);
        arrayList.add(7);
        arrayList.add(3);
        
        //ArrayList before the Sorting
        System.out.println("Before Sorting");
        for(int counter: arrayList){
            System.out.print(counter+" ");
        }
        
        //Sorting of ArrayList using Collection.sort method
        Collections.sort(arrayList);
        System.out.println("");
        
        //ArrayList after sorting
        System.out.println("After sorting");
        for(int counter: arrayList){
            System.out.print(counter+" ");
        }
    }
}
