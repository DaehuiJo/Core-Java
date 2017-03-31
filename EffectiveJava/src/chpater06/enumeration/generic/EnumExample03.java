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

interface Day{
    int Monday = 1;
    int Tuesday = 2;
    int Wednesday = 3;
    int Thursday = 4;
    int Friday = 5;
    int Saturday = 6;
    int Sunday = 7;
}

interface Month{
    int January = 1;
    int February = 2;
    int March = 3;
    int April = 4;
    int May = 5;
    int June = 6;
    int July = 7;
    int Auguest = 8;
    int September = 9;
    int October = 10;
    int November = 11;
    int December = 12;
}

public class EnumExample03 {
    public static void main(String[] args) {
        
        if(Day.Monday == Month.January){
            System.out.println("두 상수는 같습니다.");
        }
        
        int day = Day.Monday;
        
        switch(day){
            case Day.Monday: System.out.println("월요일입니다."); break;
            case Day.Tuesday: System.out.println("화요일입니다."); break;
            case Day.Wednesday: System.out.println("수요일입니다."); break;
            case Day.Thursday: System.out.println("목요일입니다."); break;
            
        }
    }
}
