/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arryList;

import java.util.ArrayList;

/**
 *
 * @author surpr
 */
public class JoinCombineArrayList {
    public static void main(String[] args) {
        //first arrayList
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("AL1: E1");
        arrayList1.add("AL1: E2");
        arrayList1.add("AL1: E3");
        
        //second arrayLIst
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("AL2: E1");
        arrayList2.add("AL2: E2");
        arrayList2.add("AL2: E3");
        
        //new arrayList
        ArrayList<String> al = new ArrayList<String>();
        al.addAll(arrayList1);
        al.addAll(arrayList2);
        
        //displaying elements of the joined ArrayList
        System.out.println("Joined ArrayList");
        for(String temp: al){
            System.out.print(temp+" ");
        }
    }
}
