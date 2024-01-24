package com.example.ExternalAuditRepo;

import com.example.ExternalAuditEntity.ExternalAuditExecution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalAuditClosureAttachRepo extends JpaRepository<ExternalAuditExecution, Long>{
}
