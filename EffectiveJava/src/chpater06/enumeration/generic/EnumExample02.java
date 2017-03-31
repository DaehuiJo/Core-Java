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
final을 사용하여 한번 지정한 뒤 바뀌지 않도록 하면서, 동시에 static을 사용하여 메모리에 한번반 할당되게 설정
*/
public class EnumExample02 {
    
    private final static int Monday = 1;
    private final static int Tuesday = 2;
    private final static int Wednesday = 3;
    private final static int Thursday = 4;
    private final static int Friday = 5;
    private final static int Saturday = 6;
    private final static int Sunday = 7;
    
    public static void main(String[] args) {
        
        int day = Monday;
        
        switch(day){
            case Monday: System.out.println("월요일입니다."); break;
            case Tuesday: System.out.println("화요일입니다."); break;
            case Wednesday: System.out.println("수요일입니다."); break;
            case Thursday: System.out.println("목요일입니다."); break;
            case Friday: System.out.println("금요일입니다."); break;
            case Saturday: System.out.println("토요일입니다."); break;
            case Sunday: System.out.println("일요일입니다."); break;
        }
    }
}
