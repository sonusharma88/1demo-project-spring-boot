package com.demo.controller;

import com.demo.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeControllerWithRequestBody {

        ArrayList<Employee> EmployeeArrayList = new ArrayList<>();

        // add , get_all , update , delete

        // add
        @RequestMapping("/add_emp_new")
        public String addEmployee(@RequestBody Employee employee) {


            EmployeeArrayList.add(employee);
            return "EMPLOYEE ADD SUCCESSFULLY..";
        }

        // get_all
        @RequestMapping("/get_all_emp_new")
        public ArrayList<Employee> getEmployeeArrayList() {
            return EmployeeArrayList;
        }

        // update
        @RequestMapping("/update_emp_new")
        public String updatEmployee() {
            Employee employee1 = EmployeeArrayList.get(0);
            employee1.setName("Aradhaya");
            return EmployeeArrayList.get(0).getName() + "Record updated successfully";


        }

        // delete
        @RequestMapping("/delete_emp_new")
        public String removeEmployee() {
            EmployeeArrayList.remove(0);
            return "Employee deleted successfully..";

        }
    }
