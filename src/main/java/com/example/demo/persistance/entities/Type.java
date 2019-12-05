package com.example.demo.persistance.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String type;
    @OneToMany(mappedBy = "type")
    private List<Incident> Incident;

    public long getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Type() {
    }

    public Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
