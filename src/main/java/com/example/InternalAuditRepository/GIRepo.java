package com.example.InternalAuditRepository;

import com.example.InternalAuditEntity.AuditRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GIRepo  extends JpaRepository<AuditRecord, Long> {

}
