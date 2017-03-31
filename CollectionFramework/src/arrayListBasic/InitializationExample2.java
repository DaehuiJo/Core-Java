/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListBasic;

import java.util.ArrayList;

/**
 *
 * @author surpr
 */
public class InitializationExample2 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>(){{
            add("Delhi");
            add("Agra");
            add("Chennai");
        }};
        System.out.println("Content of ArrayList cities: "+cities);
    }
}
