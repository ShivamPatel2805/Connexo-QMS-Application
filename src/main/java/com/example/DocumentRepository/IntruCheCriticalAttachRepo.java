package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.InstruCheCriticalAttach;
@Repository
public interface IntruCheCriticalAttachRepo extends JpaRepository<InstruCheCriticalAttach, Long>{

}
