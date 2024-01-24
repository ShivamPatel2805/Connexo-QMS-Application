package com.example.ExternalAuditRepo;


import com.example.ExternalAuditEntity.ExternalAuditMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalAuditMainRepo extends JpaRepository<ExternalAuditMain, Long> {

}
