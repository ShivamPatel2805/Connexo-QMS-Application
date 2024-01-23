package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ChangeControlEntity.GroupCommentsAttach;
@Repository
public interface GroupCommentsAttachRepo extends JpaRepository<GroupCommentsAttach, Long>{

}
