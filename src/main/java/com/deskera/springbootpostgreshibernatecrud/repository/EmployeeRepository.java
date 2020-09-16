package com.deskera.springbootpostgreshibernatecrud.repository;

import com.deskera.springbootpostgreshibernatecrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
