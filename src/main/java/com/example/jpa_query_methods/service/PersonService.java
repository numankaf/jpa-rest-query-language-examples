package com.example.jpa_query_methods.service;

import com.example.jpa_query_methods.entity.Person;
import com.example.jpa_query_methods.repository.IPersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PersonService {
    private final IPersonRepository personRepository;

    public Page<Person> findAll(Pageable pageable){
        return personRepository.findAll(pageable);
    }
}
