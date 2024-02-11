package com.example.Repository.rootcauseanaylsis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.rootcauseanaylsis.QCHeadEvaluationComments;

@Repository
public interface QCHeadEvaluationCommentsRepo extends JpaRepository<QCHeadEvaluationComments,Long> {
}
