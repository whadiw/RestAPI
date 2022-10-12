package com.wahyuhadi.restapi.services;

import java.util.Optional;

// import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wahyuhadi.restapi.models.entities.Employee;
import com.wahyuhadi.restapi.models.repos.EmployeeRepo;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee findOne(Long id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        if (!employee.isPresent()) {
            return null;
        }
        return employee.get();
    }

    public Iterable<Employee> findAll() {
        return employeeRepo.findAll();
    }

    public void removeOne(Long id) {
        employeeRepo.deleteById(id);
    }
}
