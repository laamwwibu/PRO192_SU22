/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3a;

/**
 *
 * @author VICTUS
 */

class Student {
        private String name;
        private int age;

        public Student() {
            
        }
        
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
 
        
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        
        public String toString() {
            return "name: " + this.name + "age: " + this.age;
        }
        
    }
public class Bai3a {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st = new Student("Ten cua chi", 20);
        System.out.println(st);
    }
    
}
