package com.example.demo.persistance.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "province", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")})
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true,nullable = false)
    private Long  id;
    @Column(name = "nom_prov", unique = true,nullable = false)
    private String province;
    @OneToMany(mappedBy = "province")
    private List<com.example.demo.persistance.entities.Incident> Incident;



    public Province(String province) {
        this.province = province;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Province() {
    }
}
