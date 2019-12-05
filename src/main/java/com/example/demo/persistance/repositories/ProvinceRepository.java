package com.example.demo.persistance.repositories;

import com.example.demo.persistance.entities.Province;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvinceRepository extends JpaRepository<Province,Long> {
public Province findById(long id);
}
