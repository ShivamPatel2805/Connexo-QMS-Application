package com.example.ExternalAuditRepo;

import com.example.ExternalAuditEntity.AuditPlanning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditPlanningRepo extends JpaRepository<AuditPlanning, Long> {
    // Add custom query methods if needed
}
