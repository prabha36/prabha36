package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;


public class Employee implements Comparable<Employee> {
    private String name;
    private String Designation;
    private int baseSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Employee(String name, String Designation, int baseSalary) {
        this.name = name;
        this.Designation = Designation;
        this.baseSalary = baseSalary;
    }

    public void highestSalary(ArrayList<Employee> employeeList) {
        //System.out.println("Prabhakaran");
       /* for (int i = 0; i < employeeList.size(); i++) {
            {
            }
        }*/
       /* if (employeeList.get(0).baseSalary < employeeList.get(1).baseSalary) {
            if(employeeList.get(1).baseSalary<employeeList.get(2).baseSalary) {
                System.out.println("the highest salary is : " + employeeList.get(2).baseSalary);
            }
            System.out.println("the highest salary is : " + employeeList.get(1).baseSalary);
        }
        else {
            System.out.println("the highest salary is : " + employeeList.get(0).baseSalary);
        }*/
        Employee max = (Employee) Collections.max(employeeList);
        System.out.println("Highest salary : " + max.getBaseSalary() + " for emp name : " + max.getName());
    }
    public static void main(String args[]) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        Employee employee = new Employee("Ram", "HR", 10000);
        employeeList.add(employee);
        Employee employee1 = new Employee("Raj", "HR", 20000);
        employeeList.add(employee1);
        Employee employee2 = new Employee("Karthik", "HR", 50000);
        employeeList.add(employee2);
        Employee employee3 = new Employee("Prabhakaran", "HR", 80000);
        employeeList.add(employee3);
        Employee employee4 = new Employee("Arun", "HR", 600000);
        employeeList.add(employee4);
        employee.highestSalary(employeeList);
        /*ArrayList<Employee> employeeList1= new ArrayList<Employee>();
        employeeList1.add("Ram")*/
    }

    @Override
    public int compareTo(Employee o) {
        if (this.getBaseSalary() > o.getBaseSalary()) {
            return 1;
        } else if (this.getBaseSalary() < o.getBaseSalary()) {
            return -1;
        }
        return 0;
    }
}

