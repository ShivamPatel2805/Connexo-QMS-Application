package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ChangeControlEntity.GroupCommentsCftAttach;

@Repository
public interface GroupCommentsCftAttachRepo extends JpaRepository<GroupCommentsCftAttach, Long>{

}
