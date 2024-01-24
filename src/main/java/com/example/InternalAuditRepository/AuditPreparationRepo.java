package com.example.InternalAuditRepository;

import com.example.InternalAuditEntity.AuditPreparation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditPreparationRepo extends JpaRepository<AuditPreparation, Long> {
}
