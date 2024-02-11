package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.entity.EntityMain;

import java.util.List;

@Repository
public interface EntityMainRepo extends JpaRepository<EntityMain,Long> {

    List<EntityMain> findAllByUserId(Long userId);

    EntityMain findEntityMainByIdAndUserId(Long id, Long userId);

}
