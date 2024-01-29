package com.example.CapaRepository;

import com.example.CapaEntity.CapaGeneralInfoAttach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapaGeneralInfoAttachRepo extends JpaRepository<CapaGeneralInfoAttach,Long> {
}
