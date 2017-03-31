/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListSorting;

/**
 *
 * @author surpr
 */
public class Student implements Comparable<Student> {
    private String studentname;
    private int rollno;
    private int studentage;
    
    public Student(int rollno, String studentname, int studentage){
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }

    public String getStudentname() {
        return studentname;
    }

    public int getRollno() {
        return rollno;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    @Override
    public int compareTo(Student compareStu) {
        int compareage = ((Student)compareStu).getStudentage();
        
        //For Ascending order.
        return this.studentage-compareage;
        //For Descending order.
        //return compareage-this.studentage;
    }
    

    @Override
    public String toString() {
        return "[ rollno: "+rollno+", name: "+studentname+", age: "+studentage+"]";
    }
    
    //2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator
}
