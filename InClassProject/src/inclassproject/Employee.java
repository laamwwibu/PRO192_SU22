/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassproject;

/**
 *
 * @author VICTUS
 */
public class Employee {
    private String name;
    private int salary;
    
    public Employee() {
        
    }
    
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public int getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Salary: " + salary;
    }
}
