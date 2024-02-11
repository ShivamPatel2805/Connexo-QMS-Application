package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.capaEntity.CapaDetails;

@Repository
public interface CapaDetailsRepo extends JpaRepository<CapaDetails,Long> {
}
