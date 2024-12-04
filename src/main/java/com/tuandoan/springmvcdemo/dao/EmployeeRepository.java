package com.tuandoan.springmvcdemo.dao;

import com.tuandoan.springmvcdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByOrderByLastNameAsc();
}
