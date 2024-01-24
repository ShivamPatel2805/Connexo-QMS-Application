package com.example.AuditProgramRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AuditProgramEntity.AuditProgram;
@Repository
public interface AuditProgramRepo extends JpaRepository<AuditProgram, Long>{

}
