package com.example.Repository.rootcauseanaylsis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.rootcauseanaylsis.QAEvaluationComments;

@Repository
public interface QAEvaluationCommentsRepo extends JpaRepository<QAEvaluationComments,Long> {
}
