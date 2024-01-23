package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ChangeControlEntity.QaApprovalComments;
@Repository
public interface QaApprovalCommentsRepo extends JpaRepository<QaApprovalComments, Long>{

}
