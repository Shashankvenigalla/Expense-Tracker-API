package com.expensetracker.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Double amount;

    @Enumerated(EnumType.STRING)
    private Category category;

    private LocalDate date;

    public enum Category {
        FOOD, TRAVEL, UTILITIES, ENTERTAINMENT, OTHERS
    }

    // Getters and setters
    // Constructors
}
