package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ChangeControlEntity.QaApprovalAttach;
@Repository
public interface QaApprovalAttachRepo extends JpaRepository<QaApprovalAttach, Long>{

}
