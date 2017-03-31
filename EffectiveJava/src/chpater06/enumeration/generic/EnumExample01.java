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

/*
Jdk 1.5 이전 버전에서 상수를 정의했던 방법
*/
public class EnumExample01 {
    public static void main(String[] args) {
        /*
        월요일 == 1; 화요일 == 2; 수요일 == 3; 목요일 == 4; 금요일 == 5; 토요일 == 6; 일요일 == 7;
        */
        int day = 0;
        
        switch(day){
            case 1: System.out.println("월요일입니다."); break;
            case 2: System.out.println("화요일입니다."); break;
            case 3: System.out.println("수요일입니다."); break;
            case 4: System.out.println("목요일입니다."); break;
            case 5: System.out.println("금요일입니다."); break;
            case 6: System.out.println("토요일입니다."); break;
            case 7: System.out.println("일요일입니다."); break;
        }
    }
}
