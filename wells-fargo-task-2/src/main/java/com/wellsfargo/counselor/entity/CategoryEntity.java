package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<SecurityEntity> securities;

    protected CategoryEntity() {}

    public CategoryEntity(String name) {
        this.name = name;
    }

    // Getters and setters
    public int getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SecurityEntity> getSecurities() {
        return securities;
    }

    public void setSecurities(List<SecurityEntity> securities) {
        this.securities = securities;
    }
}