package com.example.jpa_query_methods.entity;

import com.example.jpa_query_methods.enums.EBloodType;
import com.example.jpa_query_methods.enums.EPersonGender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "persons")
@Data
@EqualsAndHashCode(callSuper = true)
public class Person extends BaseEntity{

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private EPersonGender gender;

    @Column(name = "blood_type")
    @Enumerated(EnumType.STRING)
    private EBloodType bloodType;

}
