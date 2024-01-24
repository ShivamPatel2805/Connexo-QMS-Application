package com.example.InternalAuditRepository;

import com.example.InternalAuditEntity.InternalAuditRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InternalGIRepo  extends JpaRepository<InternalAuditRecord, Long> {

}
