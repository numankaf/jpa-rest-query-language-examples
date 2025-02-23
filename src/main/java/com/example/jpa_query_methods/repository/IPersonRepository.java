package com.example.jpa_query_methods.repository;

import com.example.jpa_query_methods.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends JpaRepository<Person, Long> {
}
