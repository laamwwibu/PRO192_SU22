/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readandwritefile;

import java.util.*;
import java.io.*;
import java.io.IOException;

/**
 *
 * @author VICTUS
 */

class Student {
    String name;
    int age;
    String code;
    double pro192_mark;
    double calculus_mark;
    
    Student (String name, int age, String code, double pro_192_mark, double calculus_mark) {
        this.name = name;
        this.age = age;
        this.code = code;
        this.pro192_mark = pro_192_mark;
        this.calculus_mark = calculus_mark;
    }

    Student() {
        
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
    public double getPro192Mark() {
        return this.pro192_mark;
    }
    public double getCalculusMark() {
        return this.calculus_mark;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setPro192Mark(double pro192_mark) {
        this.pro192_mark = pro192_mark;
    }
    public void setCalculusMark(double calculus_mark) {
        this.calculus_mark = calculus_mark;
    }
    
    public double Average() {
        return ((pro192_mark + calculus_mark) / 2);
    }
    
    public String Ranked() {
        if(Average() >= 8)
            return "Good";
        if(Average() <8 && Average() > 6.5)
            return "Pretty Good"; 
        return "Terrible";       
    }
    
    public String toString(){
        String ans = " =======STUDENT INFO=======\n";
        ans += "Name: "+ getName() + "\n" +
                "Age: "+ getAge() + "\n" +
                "Code: "+ getCode() + "\n" +
                "Pro192 mark: " + getPro192Mark() + "\n" +
                "Calculus mark: " + getCalculusMark() + "\n" +
                "Average: "+ Average() + "\n" +
                "Title: " + Ranked();
        return ans;
    }
    
    public void Writer() throws IOException {
        String filename = (getName() + " " + getCode()).replace(" ", "_") + ".txt";
        try {
        FileWriter fw = new FileWriter(filename);
        fw.write("Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Code: " + getCode() + "\n" +
                "Pro192 mark: " + getPro192Mark() + "\n" +
                "Calculus mark: " + getCalculusMark() + "\n" +
                "Average: " + Average() + "\n" +
                "Title: " + Ranked());
        fw.close();
            System.out.println("File was written successfully");
        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    }
}

public class Main {
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        List<Student> s_list = new ArrayList<Student>();
        FileReader fr = new FileReader("danhsachsv.txt");
        Scanner sc = new Scanner(fr);
        int count = 0;
        String reEnter;
        Scanner sc0 = new Scanner(System.in);
        while(sc.hasNextLine() == true) {
            Student s = new Student();
            String s0 = sc.nextLine();
            if(count >= 1) {
            //===============
            String s0_split[] = s0.split(", ");
            s.setName(s0_split[0]);
            String s1_split[] = s0_split[1].split(": ");
            String s2_split[] = s0_split[2].split(": ");
            String s3_split[] = s0_split[3].split(": ");
            String s4_split[] = s0_split[4].split(": ");
            int age = Integer.parseInt(s1_split[1]);
            s.setAge(age);
            s.setCode(s2_split[1]);
            double pro = Double.parseDouble(s3_split[1]);
            s.setPro192Mark(pro);
            double cal = Double.parseDouble(s4_split[1]);
            s.setCalculusMark(cal);
            s_list.add(s);
            }
            count++;
        }
        try {
            do {
                System.out.print("Enter code for student's information: ");
                String ans = sc0.nextLine();
                count = 0;
                for(int i = 0; i < s_list.size(); i++) {
                    if(ans.equals(s_list.get(i).getCode())) {
                        count++;
                        System.out.println("Student found!");
                        System.out.println(s_list.get(i));
                        System.out.print("Do you want this student's information file?<yes/no>: ");
                        String wantfile = sc0.nextLine();
                        if(wantfile.equals("yes")) s_list.get(i).Writer();
                    }
                }
                if(count == 0){
                    System.out.println("Student not found!");
                }
                System.out.print("Re-enter?<yes/no>: ");
                reEnter= sc0.nextLine();
            } while(reEnter.equals("yes"));
        } catch (Exception e) {
            System.out.println("Please enter validate code");
        }
       
    }
    
}
