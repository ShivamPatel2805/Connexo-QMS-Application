package com.example.ActionItemRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ActionItemEntity.ActionItemInfoAttach;
@Repository
public interface
ActionItemInfoAttachRepo extends JpaRepository<ActionItemInfoAttach, Long>{

}
