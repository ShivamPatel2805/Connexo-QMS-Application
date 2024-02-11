package com.example.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.capaEntity.CapaGenInfo;

@Repository
public interface CapaGeneralInfoRepo extends JpaRepository<CapaGenInfo,Long> {
}
