package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.ChemestrySop;
@Repository
public interface ChemestrySopRepo extends JpaRepository<ChemestrySop,Long> {

}
