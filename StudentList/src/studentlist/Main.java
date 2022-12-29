/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author VICTUS
 */

class Student {
    String name;
    int age;
    String code;
    int pro192_mark;
    int calculus_mark;
    
    Student(String name, int age, String code, int pro192_mark, int calculus_mark) {
        this.name = name;
        this.age = age;
        this.calculus_mark = calculus_mark;
        this.pro192_mark = pro192_mark;
    }
    
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getCode() {
        return this.code;
    }
    public int ProMark() {
        return this.pro192_mark;
    }
    public int getCalculusMark() {
        return this.calculus_mark; 
    }
    public void setName(String name) {
        this.name = name;
    }
    public void getAge(int age) {
        this.age = age;
    }
    public void getCode(String code) {
        this.code = code;
    }
    public void ProMark(int pro192_mark) {
        this.pro192_mark = pro192_mark;
    }
    public void getCalculusMark(int calculus_mark) {
        this.calculus_mark = calculus_mark; 
    } 
    
    public double Average() {
        return (pro192_mark + calculus_mark) / 2;
    }
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
