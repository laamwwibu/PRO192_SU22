/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewrite;

import java.io.*;

public class Main {
    public static void main(String [] args){
        System.out.println("File Projects!");
        String line;
        Student [] my_student_list = new Student[200];
        try {
            BufferedReader bufferreader;
            bufferreader = new BufferedReader(new FileReader("D:\\CODE\\PRO192\\danhsachsv.txt"));
            int idx = 0;
            while ((line = bufferreader.readLine()) != null) {
                System.out.println(idx + ": " + line);
                // ====
                // =====
                idx++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
