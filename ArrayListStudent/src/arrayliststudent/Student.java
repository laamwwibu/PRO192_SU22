/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayliststudent;

/**
 *
 * @author VICTUS
 */
public class Student {
    private String name;
    private String code;
    private int mark;
    
    public Student() {
        
    }
    
    public Student(String name, String code, int mark) {
        this.name = name;
        this.code = code;
        this.mark = mark;
    }
    
    public void setName(String name) {
        this.name =name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setMark(int mark) {
        this.mark = mark;
    }
    
    public int getMark() {
        return mark;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Code: " + code + ", Mark: " + mark;
    }
}
