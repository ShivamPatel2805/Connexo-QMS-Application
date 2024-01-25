package com.example.ExternalAuditRepo;
import com.example.ExternalAuditEntity.AuditResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalAuditResponseRepo extends JpaRepository<AuditResponse, Long>{
}