/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListSorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author surpr
 */
public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(new Student(223, "Chaitanya", 26));
        arrayList.add(new Student(245, "Rahul", 24));
        arrayList.add(new Student(209, "Ajeet", 32));
        
        Collections.sort(arrayList);
        
        for(Student str : arrayList){
            System.out.println(str);
        }
    }
}
