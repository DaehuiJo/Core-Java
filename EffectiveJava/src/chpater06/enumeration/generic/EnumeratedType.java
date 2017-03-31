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
http://rangken.github.io/blog/2015/effective-java-5/

열거 자료형(enumerated Type)은 고정 개수의 상수들로 값이 구성되는 자료형.
int 대신 enum을 사용하면 공간적, 시간적 손해를 보긴하지만 성능면에서 비등하다.
enum은 가독성이 좋고 안전하면 강력함.
생성자나 멤버변수가 필요 없으나 데이터 또는 그 데이터에 관계된 메서드를 추가해서 기능을 향상시킨 enum도 많음.
int enum pattern: 사용 불가

public static final int APPLE_FUJI = 0;
public static final int APPLE_PIPPIN = 1;
...
int i = (APPLE_FUJI - ORANGE_TEMPLE) / APPLE_PIPPIN; 변수가 섞임
*/

public class EnumeratedType {
    
}
