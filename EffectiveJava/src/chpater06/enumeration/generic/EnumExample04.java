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

class Day_01{
    public final static Day_01 Monday = new Day_01();
    public final static Day_01 Tuesday = new Day_01();
    public final static Day_01 Wednesday = new Day_01();
}

class Month_01{
    public final static Month_01 January = new Month_01();
    public final static Month_01 February = new Month_01();
    public final static Month_01 March = new Month_01();
}

public class EnumExample04 {
    public static void main(String[] args) {
        
        //if(Day_01.Monday == Month_01.January){ //서로 다른 자료형 판명되어 비교 불가
            System.out.println("");
        }
        
        Day_01 day = Day_01.Monday;
        //switch(day){
            
        //}
    //}
}
