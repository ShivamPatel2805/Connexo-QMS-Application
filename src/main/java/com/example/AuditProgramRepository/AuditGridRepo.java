package com.example.AuditProgramRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AuditProgramEntity.AuditGridAttach;
@Repository
public interface AuditGridRepo extends JpaRepository<AuditGridAttach, Long>{

}
