package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.capaEntity.Material;
import com.example.database.capaEntity.MaterialAndEquipmentInfo;

@Repository
public interface MaterialAndEquipmentInfoRepo extends JpaRepository<MaterialAndEquipmentInfo,Long> {
}
