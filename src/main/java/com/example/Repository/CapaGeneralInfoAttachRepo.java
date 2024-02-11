package com.example.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.capaEntity.CapaGeneralInfoAttach;

@Repository
public interface CapaGeneralInfoAttachRepo extends JpaRepository<CapaGeneralInfoAttach,Long> {
}
