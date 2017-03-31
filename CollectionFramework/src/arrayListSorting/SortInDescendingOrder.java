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
public class SortInDescendingOrder {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("AA");
        arrayList.add("BB");
        arrayList.add("CC");
        arrayList.add("ZZ");
        
        //Unsorted List: ArrayList content before sorting.
        System.out.println("Befor Sorting.");
        for(String str : arrayList){
            System.out.println(str);
        }
        
        //Sorting in decreasing order.
        Collections.sort(arrayList, Collections.reverseOrder());
        
        //Sorted List decreasing order.
        System.out.println("ArrayList in descending order");
        for(String str : arrayList){
            System.out.println(str);
        }
    }
}
