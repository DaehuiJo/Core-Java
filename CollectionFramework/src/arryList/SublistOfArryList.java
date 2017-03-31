/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arryList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author surpr
 */
public class SublistOfArryList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        
        //Adding
        al.add("Steve");
        al.add("Justin");
        al.add("Ajeet");
        al.add("John");
        al.add("Arnold");
        al.add("Chaitanya");
        
        System.out.println("Original ArrayList Content: "+al);
        
        //Sublist to ArrayList
        ArrayList<String> al2 = new ArrayList<String>(al.subList(1,4));
        System.out.println("Sublist stored in ArrayList: "+al2);
        
        //Sublist to List
        List<String> list = al.subList(1, 4);
        System.out.println("SubList stored in List: "+list);
    }
}
