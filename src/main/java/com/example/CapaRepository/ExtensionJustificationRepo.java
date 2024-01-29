package com.example.CapaRepository;

import com.example.CapaEntity.ExtensionJustification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtensionJustificationRepo extends JpaRepository<ExtensionJustification,Long> {
}
