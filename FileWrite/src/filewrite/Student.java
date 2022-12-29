/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewrite;

import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException;

/**
 *
 * @author VICTUS
 */
public class Student {
    private String name, mssv;
    private int age;
    Student(){

    }
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name, int age, String mssv) {
        this.name = name;
        this.age = age;
        this.mssv = mssv;
    }

    public String toString() {
        String ans = " =======STUDENT INFO=======\n";
        ans += "NAME: " + this.name + "\nAGE: " + this.age;
        return ans;
    }
    
    public void write_file_info() {
        String file_name = this.name.replace(" ", "_") + "_" + this.mssv + ".txt";
        try {
            FileWriter myWriter = new FileWriter(file_name);
            myWriter.write("Student Name: " + this.name + "\n");
            myWriter.write("Student Age: " + this.age);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
