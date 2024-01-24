package com.example.InternalAuditRepository;

import com.example.InternalAuditEntity.EntityMain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternalAuditMainRepo extends JpaRepository<EntityMain, Long> {

}
