package com.example.InternalAuditRepository;


import com.example.InternalAuditEntity.AuditPlanning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalAuditAttachRepo extends JpaRepository<AuditPlanning, Long> {
    // Add custom query methods if needed
}
