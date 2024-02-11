package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.capaEntity.Additional;

@Repository
public interface AdditionalRepo extends JpaRepository<Additional,Long> {
}
