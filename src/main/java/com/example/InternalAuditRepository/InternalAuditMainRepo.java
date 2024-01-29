package com.example.InternalAuditRepository;

import com.example.InternalAuditEntity.InternalEntityMain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternalAuditMainRepo extends JpaRepository<InternalEntityMain, Long> {

}
