package com.example.CapaRepository;

import com.example.CapaEntity.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepo extends JpaRepository<Material,Long> {
}
