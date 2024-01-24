package com.example.ExternalAuditRepo;

import com.example.ExternalAuditEntity.AuditRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalGIRepo  extends JpaRepository<AuditRecord,Long> {

}
