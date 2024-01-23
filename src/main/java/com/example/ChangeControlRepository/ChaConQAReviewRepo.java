package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ChangeControlEntity.ChaConQAReview;

@Repository
public interface ChaConQAReviewRepo extends JpaRepository<ChaConQAReview, Long>{

}
