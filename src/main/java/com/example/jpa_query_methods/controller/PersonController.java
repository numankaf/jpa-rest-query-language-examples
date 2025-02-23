package com.example.jpa_query_methods.controller;

import com.example.jpa_query_methods.entity.Person;
import com.example.jpa_query_methods.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @GetMapping()
    public ResponseEntity<Page<Person>> findAll(Pageable pageable){
        return ResponseEntity.ok(personService.findAll(pageable));
    }

}
