/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatterndemo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author kat26
 */
public class Employee {
    
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new LinkedList();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }
    
    public void remove(Employee e) {
        subordinates.remove(e);
    }
    
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", dept=" + dept + ", salary=" + salary + '}';
    }
            
}
