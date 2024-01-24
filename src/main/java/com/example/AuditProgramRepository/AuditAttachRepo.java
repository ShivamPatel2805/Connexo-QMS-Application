package com.example.AuditProgramRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AuditProgramEntity.AuditInfoAttach;
@Repository
public interface AuditAttachRepo extends JpaRepository<AuditInfoAttach, Long>{

}
