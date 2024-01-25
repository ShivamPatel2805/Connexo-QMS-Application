package com.example.CapaRepository;

import com.example.CapaEntity.CapaClosure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapaClosureRepo extends JpaRepository<CapaClosure,Long> {
}
