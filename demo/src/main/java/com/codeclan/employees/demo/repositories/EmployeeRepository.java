package com.codeclan.employees.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codeclan.employees.demo.models.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
