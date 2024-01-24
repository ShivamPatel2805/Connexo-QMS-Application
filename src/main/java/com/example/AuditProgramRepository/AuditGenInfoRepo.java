package com.example.AuditProgramRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AuditProgramEntity.AuditGeneralInfo;
@Repository
public interface AuditGenInfoRepo extends JpaRepository<AuditGeneralInfo, Long>{

}
