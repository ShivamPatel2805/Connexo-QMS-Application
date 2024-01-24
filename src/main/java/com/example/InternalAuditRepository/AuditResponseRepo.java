package com.example.InternalAuditRepository;
import com.example.InternalAuditEntity.InternalAuditResponse;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AuditResponseRepo extends JpaRepository<InternalAuditResponse, Long>{
}
