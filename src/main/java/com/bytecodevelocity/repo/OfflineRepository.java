package com.bytecodevelocity.repo;

import java.util.ArrayList;
import java.util.List;

public class OfflineRepository {
    public static List<Employee> getEmployees() {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(123, "Arun", "Chennai", 12345));
        empList.add(new Employee(124, "Sam", "Hydrabad", 12545));
        empList.add(new Employee(125, "Paul", "Bengalore", 17345));
        empList.add(new Employee(126, "Daniel", "Chennai", 19345));
        empList.add(new Employee(127, "Nancy", "Chennai", 2345));
        return empList;
    }
}
