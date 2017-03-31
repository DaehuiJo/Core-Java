/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arryList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author surpr
 */
public class ArrayToArrayListExameple01 {
    public static void main(String[] args) {
        
        //Array Declartion and initialization
        String cityNames[] = {"Agra", "Mysore", "Chandigarh", "Bhopal"};
        
        //Array to ArrayList conversion
        ArrayList<String> cityList = new ArrayList<String>(Arrays.asList(cityNames));
        
       //Adding new elements to the converted List
       cityList.add("new City2");
       cityList.add("new City3");
       
       //Final ArrayList content display using for
       for(String str: cityList){
           System.out.print(str+"  ");
       }
    }
}
