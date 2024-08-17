package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class PortfolioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientEntity client;

    @Column(nullable = false)
    private Date creationDate;

    @OneToMany(mappedBy = "portfolio")
    private List<SecurityEntity> securities;

    protected PortfolioEntity() {}

    public PortfolioEntity(ClientEntity client, Date creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    // Getters and setters
    public int getPortfolioId() {
        return portfolioId;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<SecurityEntity> getSecurities() {
        return securities;
    }

    public void setSecurities(List<SecurityEntity> securities) {
        this.securities = securities;
    }
}