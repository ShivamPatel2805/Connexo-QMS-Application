package com.example.InternalAuditRepository;

import com.example.InternalAuditEntity.InternalAuditPreparation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditPreparationRepo extends JpaRepository<InternalAuditPreparation, Long> {
}
