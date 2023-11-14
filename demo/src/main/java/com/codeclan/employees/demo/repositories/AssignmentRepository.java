package com.codeclan.employees.demo.repositories;

import com.codeclan.employees.demo.models.Assignments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignments, Long> {
}
