package com.example.ActionItemRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ActionItemEntity.ActionItem;
@Repository
public interface ActionItemRepo extends JpaRepository<ActionItem, Long>{

}
