package com.example.jpa_query_methods.entity;

import com.example.jpa_query_methods.embeddable.Address;
import com.example.jpa_query_methods.enums.EBloodType;
import com.example.jpa_query_methods.enums.EPersonGender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Entity
@Table(name = "persons")
@Data
@EqualsAndHashCode(callSuper = true)
public class Person extends BaseEntity {

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "serial_number")
    private Integer serialNumber;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private EPersonGender gender;

    @Column(name = "blood_type")
    @Enumerated(EnumType.STRING)
    private EBloodType bloodType;

    @Column(name = "joining_date")
    private Date joiningDate;

    @Embedded
    private Address address;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;
}
