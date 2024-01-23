package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ChangeControlEntity.GroupComments;
@Repository
public interface GroupCommentsRepo extends JpaRepository<GroupComments, Long>{

}
