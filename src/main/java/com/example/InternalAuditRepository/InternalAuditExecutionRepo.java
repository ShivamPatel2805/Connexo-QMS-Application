package com.example.InternalAuditRepository;


import com.example.InternalAuditEntity.InternalAuditExecution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface InternalAuditExecutionRepo  extends JpaRepository<InternalAuditExecution, Long>{
}
