/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListBasic;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author surpr
 */
public class InitializationExample1 {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>(
            Arrays.asList("Pratap", "Peter", "Harsh"));
        
        System.out.println("Elements are: "+obj);
    }
}
