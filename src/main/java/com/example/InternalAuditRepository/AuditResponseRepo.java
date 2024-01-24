package com.example.InternalAuditRepository;
import com.example.InternalAuditEntity.AuditResponse;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AuditResponseRepo extends JpaRepository<AuditResponse, Long>{
}
