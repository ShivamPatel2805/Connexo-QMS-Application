package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.InstruChemestrySop;
@Repository
public interface InstruChemestrySopRepo extends JpaRepository<InstruChemestrySop, Long>{

}
