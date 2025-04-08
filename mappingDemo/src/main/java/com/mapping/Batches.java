package com.mapping;

import jakarta.persistence.*;

@Entity
public class Batches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "batches")
    private Student student;
}
