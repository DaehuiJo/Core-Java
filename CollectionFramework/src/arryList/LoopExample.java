/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arryList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author surpr
 */
public class LoopExample {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(14);
        arrList.add(7);
        arrList.add(39);
        arrList.add(40);
        
        //For Loop for iteration ArrayList
        System.out.println("For Loop");
        for(int counter=0; counter<arrList.size(); counter++){
            System.out.println(arrList.get(counter));
        }
        
        //Advanced For Loop
        System.out.println("Advanced For Loop");
        for(Integer num : arrList){
            System.out.println(num);
        }
        
        //While Loop for iteration ArrayList
        System.out.println("While Loop");
        int count = 0;
        while(arrList.size()>count){
            System.out.println(arrList.get(count));
            count++;
        }
        
        //Looping Array List using Iterator
        System.out.println("Iterator");
        Iterator iter = arrList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
