package com.wahyuhadi.restapi.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.wahyuhadi.restapi.models.entities.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
}
