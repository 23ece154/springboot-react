package com.example.demo.services;

import com.example.demo.models.Employee;
import com.example.demo.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> emp1 = new ArrayList<>(
            Arrays.asList(new Employee(1,"Karthika","manager")));

    public List<Employee> getEmp() {
//        return "hello world";
        return emp1;
    }

    public Employee getEmp(int empId) {
        int ind = 0;
        boolean flag = false;
        for(int i = 0; i < emp1.size(); i++) {
            if (empId == emp1.get(i).getEmpId()) {
                System.out.println("EmpID: " + emp1.get(i).getEmpId());
                ind = i;
                flag = true;
                break;
            }
        }
            if(flag){
                return emp1.get(ind);
            }
            else {
                return new Employee();
            }
    }

    public String postmethod(Employee employee){
        emp1.add(employee);
        return "employee added successfully";
    }
    public String putmethod(Employee employee){
        int ind = 0;
        boolean flag = false;
        for(int i = 0; i < emp1.size(); i++) {
            if (employee.getEmpId() == emp1.get(i).getEmpId()) {
                System.out.println("EmpID: " + emp1.get(i).getEmpId());
                ind = i;
                flag = true;
                break;
            }
        }
        if(flag){
            emp1.set(ind,employee);
            return "updated successfully";
        }
        else {
            return "not found";
        }
    }
    public String deleteEmpById(int empId){
        int ind = 0;
        boolean flag = false;
        for(int i = 0; i < emp1.size(); i++) {
            if (empId == emp1.get(i).getEmpId()) {
                ind = i;
                flag = true;
                break;
            }
        }
        if(flag){
            emp1.remove(ind);
            return "deleted ";
        }
        else {
            return "Employee not found";
        }
    }

}
