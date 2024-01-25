package com.example.InternalAuditRepository;


import com.example.InternalAuditEntity.InternalAuditPlanning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalAuditClosureAttachRepo extends JpaRepository<InternalAuditPlanning, Long> {
    // Add custom query methods if needed
}