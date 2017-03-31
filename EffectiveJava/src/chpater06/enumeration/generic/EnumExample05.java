/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chpater06.enumeration.generic;

/**
 *
 * @author surpr
 */

enum Day_02{
    Monday, TuesDay, Wednesday, Thursday, Friday, Saturday, Sunday;
}
enum Month_02{
    January, February, March, April, May, June, July, August, September, October, November, December;
}

public class EnumExample05 {
    public static void main(String[] args) {
        Day_02 day = Day_02.Monday;
        
        switch(day){
            case Monday: System.out.println("월요일입니다."); break;
            case TuesDay: System.out.println("화요일입니다."); break;
            
        }
    }
}
