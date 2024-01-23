package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ChangeControlEntity.ChaConQAReviewAttachment;

@Repository
public interface ChaConQAReviewAttachRepo extends JpaRepository<ChaConQAReviewAttachment, Long>{

}
