package com.example.CapaRepository;

import com.example.CapaEntity.EffectivenessCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EffectivenessCheckRepo extends JpaRepository<EffectivenessCheck,Long> {
}
