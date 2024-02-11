package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.capaEntity.GroupComment;

@Repository

public interface GroupCommentRepo extends JpaRepository<GroupComment,Long> {
}
