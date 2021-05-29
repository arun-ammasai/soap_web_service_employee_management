package com.bytecodevelocity.service;

import com.bytecodevelocity.repo.Employee;
import com.bytecodevelocity.repo.OfflineRepository;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Component
public class EmployeeServiceImpl {
    List<Employee> listOfEmployees = OfflineRepository.getEmployees();
    public Employee getEmployee(int employeeId) {
        Optional<Employee> employee = listOfEmployees.stream()
                .filter(emp -> emp.getEmployeeId() == employeeId)
                .findFirst();
        return employee.get();
    }

    public List<Employee> getAllEmployees() {
        return listOfEmployees;
    }

    public boolean removeEmployee(int employeeId) {
        Iterator<Employee> iterator = listOfEmployees.iterator();
        while (iterator.hasNext()){
            Employee emp = iterator.next();
            if(employeeId == emp.getEmployeeId()){
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
