package com.example.jpa_query_methods.enums;

import lombok.Getter;

@Getter
public enum EBloodType {
    A_POSITIVE("A+"),
    A_NEGATIVE("A-"),
    B_POSITIVE("B+"),
    B_NEGATIVE("B-"),
    AB_POSITIVE("AB+"),
    AB_NEGATIVE("AB-"),
    O_POSITIVE("O+"),
    O_NEGATIVE("O-");

    private final String label;

    EBloodType(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
