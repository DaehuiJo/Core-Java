/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListBasic;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author surpr
 */
public class InitializationExample4 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>(Collections.nCopies(10, 5));
        
        System.out.println("ArrayList items: "+intList);
    }
}
