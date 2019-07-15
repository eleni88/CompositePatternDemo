/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatterndemo;

import java.util.Iterator;

/**
 *
 * @author kat26
 */
public class CompositePatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO", 30000);
        Employee headSales = new Employee("Robert", "Head Sales", 20000);
        Employee headMarketing = new Employee("Michael", "Head Marketing", 20000);
        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);
        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);
        
        System.out.println(CEO);
        Iterator it = CEO.getSubordinates().iterator();
        while(it.hasNext()) {
            Employee e = (Employee) it.next();
            System.out.println(e);
            Iterator it1 = e.getSubordinates().iterator();
            while(it1.hasNext()) {
                System.out.println(it1.next());
            }
            System.out.println("----------");
            
        }
        
    }

}
