package com.example.InternalAuditRepository;


import com.example.InternalAuditEntity.AuditExecution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AuditExecutionRepo  extends JpaRepository<AuditExecution, Long>{
}
