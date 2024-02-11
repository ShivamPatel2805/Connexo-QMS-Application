package com.example.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.capaEntity.Equipment;

@Repository
public interface EquipmentRepo extends JpaRepository<Equipment,Long> {
}
