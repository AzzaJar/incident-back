package com.example.demo.persistance.repositories;

import com.example.demo.persistance.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type,Long> {
    public Type findById(long id);
}
