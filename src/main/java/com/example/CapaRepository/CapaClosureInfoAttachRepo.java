package com.example.CapaRepository;

import com.example.CapaEntity.CapaClosureInfoAttach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapaClosureInfoAttachRepo extends JpaRepository<CapaClosureInfoAttach,Long> {
}
