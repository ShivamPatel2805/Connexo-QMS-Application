package com.example.CapaRepository;

import com.example.CapaEntity.CapaGenInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapaGeneralInfoRepo extends JpaRepository<CapaGenInfo,Long> {
}
