package com.lata.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lata.demo.entities.Employee;
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{
Employee findByEname(String ename);
}
