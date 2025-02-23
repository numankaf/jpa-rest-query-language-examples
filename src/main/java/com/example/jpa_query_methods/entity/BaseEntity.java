package com.example.jpa_query_methods.entity;

import jakarta.persistence.*;
import lombok.Data;

@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;
}
