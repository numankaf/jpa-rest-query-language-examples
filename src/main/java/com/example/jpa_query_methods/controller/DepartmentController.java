package com.example.jpa_query_methods.controller;

import com.example.jpa_query_methods.entity.Department;
import com.example.jpa_query_methods.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping()
    public ResponseEntity<Page<Department>> findAll(Pageable pageable){
        return  ResponseEntity.ok(departmentService.findAll(pageable));
    }

}
