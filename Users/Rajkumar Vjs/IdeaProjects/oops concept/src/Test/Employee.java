package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
    String name;
    String Designation;
    int baseSalary;
    public Employee (String name,String Designation,int baseSalary) {
        this.name = name;
        this.Designation = Designation;
        this.baseSalary = baseSalary;
    }
    public void HighestSalary(ArrayList<Employee> employeeList) {
        for(int i=0;i<employeeList.size();i++){
            
        }

    }
    public static void main(String args[]) {
        ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
        Employee employee = new Employee("Ram", "HR",10000);
        EmployeeList.add(employee);
        Employee employee1 = new Employee("Raj", "HR",20000);
        EmployeeList.add(employee1);
        Employee employee2 = new Employee("Karthik", "HR",50000);
        EmployeeList.add(employee2);
        Employee employee3 = new Employee("Prabhakaran", "HR",80000);
        EmployeeList.add(employee3);
        Employee employee4 = new Employee("Arun", "HR",60000);
        EmployeeList.add(employee4);

        employee4.HighestSalary(EmployeeList);


    }
}
