package com.product.java.eight.stream;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStremTest {

    public static List<Employee> getEmployeeList(){
        List<Employee> employees=new ArrayList<>();

        employees.add(new Employee(1,"Gill",10000.00,
                'M',"2010-01-18","MC","Gujarat"));
        employees.add(new Employee(2,"Rohit",20000.00,
                'M',"2008-01-18","MC","Mumbai"));
        employees.add(new Employee(3,"Smrithi",30000.00,
                'F',"2016-01-18","FC","Bengalore"));
        employees.add(new Employee(4,"Jemiamah",40000.00,
                'F',"2018-01-18","FC","Delhi"));
        employees.add(new Employee(5,"Harman",50000.00,
                'F',"2012-01-18","FC","Mumbai"));

        return employees;
    }

    public static void main(String[] args) {
        List<Employee> employeeList=getEmployeeList();

        //intermediate operation e.g: filter
        //terminal operation e.g forEach,toList,toSet
//       List<Employee> femaleEMployeeList= employeeList.stream().filter((a)->a.getGender().equals('F')).toList();
//
//       List<Employee> femaleWithCore=new ArrayList<>();
//
//       for (Employee femaleEmployee:employeeList){
//           if(femaleEmployee.getGender().equals('F')){
//               femaleWithCore.add(femaleEmployee);
//           }
//
//       }
//
//        femaleEMployeeList.forEach((n)->System.out.println(n));

        //count number of male and female employees

      Map<String,Long> countEmployeeBasedOnDepartment= employeeList.stream().
              collect(Collectors.groupingBy(e->e.getDepartmentName(),Collectors.counting()));
        Map<String,Long> countEmployeeBasedOnDepartmentWithMethodRefrence = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getDepartmentName,Collectors.counting()));

//     for(Map.Entry<String,Long> count:countEmployeeBasedOnDepartmentWithMethodRefrence.entrySet()){
//         System.out.println(count.getKey()+count.getValue());
//     }

//        countEmployeeBasedOnDepartmentWithMethodRefrence.forEach((k, v)->System.out.println("departmentName"+k+"count:"+v));

        //print employees name with asending order
//        employeeList.stream().sorted(Comparator.comparing(Employee::getName))
//                .forEach( System.out::println);

        //print employees name with desending order
//        employeeList.stream().sorted(Comparator.comparing(Employee::getName).reversed())
//                .forEach( System.out::println);

        //most experiene employee in organization
        employeeList.stream().sorted(Comparator.comparing(Employee::getDateOfJoining)).findFirst()
                .ifPresent(System.out::println);






    }
}
