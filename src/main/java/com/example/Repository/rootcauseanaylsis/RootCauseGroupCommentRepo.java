package com.example.Repository.rootcauseanaylsis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.rootcauseanaylsis.RootCauseGroupComment;

@Repository
public interface RootCauseGroupCommentRepo extends JpaRepository<RootCauseGroupComment,Long> {
}
