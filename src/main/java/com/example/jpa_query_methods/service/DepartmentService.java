package com.example.jpa_query_methods.service;

import com.example.jpa_query_methods.entity.Department;
import com.example.jpa_query_methods.repository.IDepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final IDepartmentRepository departmentRepository;

    public Page<Department> findAll(Pageable pageable){
        return departmentRepository.findAll(pageable);
    }
}
