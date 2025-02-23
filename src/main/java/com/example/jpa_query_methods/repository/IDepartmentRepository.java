package com.example.jpa_query_methods.repository;

import com.example.jpa_query_methods.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Long> {
}
