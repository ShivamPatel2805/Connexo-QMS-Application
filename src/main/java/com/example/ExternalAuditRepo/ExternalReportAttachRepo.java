package com.example.ExternalAuditRepo;

import com.example.ExternalAuditEntity.AuditExecution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalReportAttachRepo extends JpaRepository<AuditExecution, Long>{
}
